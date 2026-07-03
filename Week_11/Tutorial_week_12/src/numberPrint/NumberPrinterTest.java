package numberPrint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPrinterTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent)); // capture println output instead of showing it
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut); // always restore the real console afterward
    }

    @Test
    public void testHasNextInitiallyTrue() {
        NumberPrinter printer = new NumberPrinter(5);
        assertTrue(printer.hasNext());
    }

    @Test
    public void testHasNextFalseForZeroRange() {
        NumberPrinter printer = new NumberPrinter(0);
        assertFalse(printer.hasNext());
    }

    @Test
    public void testPrintNextNumberSingleThreaded() {
        NumberPrinter printer = new NumberPrinter(3);
        printer.printNextNumber(); // prints 1
        printer.printNextNumber(); // prints 2
        printer.printNextNumber(); // prints 3

        assertFalse(printer.hasNext());

        String output = outContent.toString();
        assertTrue(output.contains("printed: 1"));
        assertTrue(output.contains("printed: 2"));
        assertTrue(output.contains("printed: 3"));
    }

    @Test
    public void testPrintNextNumberWhenExhausted() {
        NumberPrinter printer = new NumberPrinter(1);
        printer.printNextNumber(); // uses up the only number
        printer.printNextNumber(); // nothing left

        String output = outContent.toString();
        assertTrue(output.contains("has nothing else to print"));
    }

    // ---- The important one: verifies the synchronization actually works ----
    @Test
    public void testConcurrentPrintingHasNoDuplicatesOrSkips() throws InterruptedException {
        int range = 200; // larger range = more chances for a race condition to surface
        NumberPrinter printer = new NumberPrinter(range);

        // Both threads run the SAME loop against the SAME shared printer object.
        Runnable task = () -> {
            while (printer.hasNext()) {
                printer.printNextNumber();
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        // join() blocks the TEST thread here until both worker threads have
        // fully finished -- without this, we might check the output before
        // the threads are actually done.
        t1.join();
        t2.join();

        // Extract every number that was actually printed, from lines like
        // "T1 printed: 42", using a regex to grab just the digits.
        List<Integer> printedNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("printed: (\\d+)");
        for (String line : outContent.toString().split("\\R")) {
            Matcher m = pattern.matcher(line);
            if (m.find()) {
                printedNumbers.add(Integer.parseInt(m.group(1)));
            }
        }

        // If synchronization were broken, this size check alone would likely
        // already fail (fewer than 'range' entries = a skipped number,
        // since a duplicate would also occupy a slot that should belong
        // to a different number).
        assertEquals(range, printedNumbers.size());

        // Sorting and comparing against 1,2,3...range confirms BOTH that
        // nothing was skipped AND nothing was duplicated -- a duplicate
        // would break the strict 1-to-1 sequential match below.
        Collections.sort(printedNumbers);
        for (int i = 0; i < range; i++) {
            assertEquals(i + 1, printedNumbers.get(i));
        }
    }
}