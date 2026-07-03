/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package numberPrint;

/**
 *
 * @author b.villarini
 */
public class NumberPrintProject {

    public static void main(String[] args) {
        
        NumberPrinter printer = new NumberPrinter(20); // Shared resource with numbers 1 to 20
        
        Thread thread1 = new Thread(new NumberPrinterThread(printer), "Thread 1");
        Thread thread2 = new Thread(new NumberPrinterThread(printer), "Thread 2");

        thread1.start();
        thread2.start();
        
    }
}
