package dateProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    private Date date;

//    Why setUp() matters:
//    @BeforeEach runs this before every single @Test method,
//    giving each test a brand-new Date object with the same starting values.
//    If tests shared one Date instance and modified it,
//    test order would start affecting results —
//    a test could pass or fail depending on what ran before it,
//    which defeats the point. like, if we enter a wrong date,
//    next test might get affected.
    @BeforeEach
    public void setUp() {
        date = new Date(18, 11, 2024);
    }

    @AfterEach
    public void tearDown() {
        // nothing to clean up here — no files, network connections, etc.
        // left empty on purpose
    }

    //The constructor
    // We know date was constructed with (18, 11, 2024),
    // so we're just confirming the constructor actually stored those values correctly
    @Test
    public void testConstructor() {
        //assertEquals(expected, actual)
        assertEquals(18, date.getDay());
        assertEquals(11, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    //testing getters and setters
    @Test
    public void testSetAndGetDay() {
        date.setDay(20);
        assertEquals(20, date.getDay());
    }
    @Test
    public void testSetAndGetMonth() {
        date.setMonth(6);
        assertEquals(6, date.getMonth());
    }
    @Test
    public void testSetAndGetYear() {
        date.setYear(2030);
        assertEquals(2030, date.getYear());
    }

    //extra
    @Test
    public void testSetYearRejectsInvalid() {
        date.setYear(1800); //invalid bc limit was 1939-2099
        assertEquals(2024, date.getYear());
        //This confirms your validation logic actually protects the field, not just that valid input works.
    }
    //JUnit calls setUp() fresh, from scratch, before every single @Test method —
    // not once at the start of the whole class. So the sequence for testSetYearRejectsInvalid specifically is:
    //
    //JUnit is about to run testSetYearRejectsInvalid
    //First, it calls setUp() → creates a brand new Date object → date.year is 2024
    //Then it runs the actual test body: date.setYear(1800)

    @Test
    public void testSetDayRejectsInvalid() {
        date.setDay(81);
        assertEquals(18, date.getDay());
    }

    // ---- addDays: normal case, no rollover ----
    @Test
    public void testAddDaysAcrossYearBoundary() {
        Date d = new Date(28, 12, 2024);
        d.addDays(4);
        assertEquals(2025, d.getYear());
        assertEquals(1, d.getMonth());
        assertEquals(1, d.getDay());

    }

    // ---- addDays: boundary case, rolls over month only (no year change) ----
    @Test
    public void testAddDaysAcrossMonthBoundary() {
        Date d = new Date(25, 1, 2024);
        d.addDays(10); // Jan has 31 days: 25 + 10 = 35 -> rolls into Feb
        assertEquals(2024, d.getYear());
        assertEquals(2, d.getMonth());
        assertEquals(4, d.getDay());
    }

    // ---- addDays: leap year edge case ----
    @Test
    public void testAddDaysLeapYearFebruary() {
        Date d = new Date(28, 2, 2024); // 2024 IS a leap year -> Feb has 29 days
        d.addDays(1);
        assertEquals(2024, d.getYear());
        assertEquals(2, d.getMonth());
        assertEquals(29, d.getDay()); // stays in February, doesn't roll to March
    }


}
