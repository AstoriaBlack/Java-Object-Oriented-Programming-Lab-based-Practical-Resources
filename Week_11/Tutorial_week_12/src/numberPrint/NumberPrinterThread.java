/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberPrint;

/**
 *
 * @author b.villarini
 */
public class NumberPrinterThread implements Runnable{
    
    NumberPrinter printer;
    
    public NumberPrinterThread(NumberPrinter printer ){
        this.printer = printer;
    }
        

    @Override
    public void run() {
        // hasNext() is synchronized, so this is a safe way to check --
        // no direct access to printer.currentIndex from outside the class.
        while (printer.hasNext()) {
                    printer.printNextNumber();
                    try {
                        Thread.sleep(100); // Simulate some delay
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
    
}
