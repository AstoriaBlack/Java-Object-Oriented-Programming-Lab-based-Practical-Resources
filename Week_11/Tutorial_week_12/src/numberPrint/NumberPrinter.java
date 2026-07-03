/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberPrint;

import java.util.*;

/**
 *
 * @author b.villarini
 */
public class NumberPrinter {
    
    public final List<Integer> numbersList = new ArrayList<>();
    private int currentIndex = 0;
    // made private -- outside classes should never touch this directly

    public NumberPrinter(int range) {
        for (int i = 1; i <= range; i++) {
            numbersList.add(i);
        }
    }

    // synchronized -- the check, print, and increment now happen as ONE
    // uninterruptible step. A second thread calling this while another is
    // still inside will simply wait its turn.
    public synchronized void printNextNumber() {
        
        // follow the comments to implement your code:
        
        // 1 - Check if current index is less then the total number of element in the list
        if (currentIndex < numbersList.size()) {
            // 2 - if 1) is true then print on the screen the current thread name and the current element in the list
            System.out.println (Thread.currentThread().getName() + " printed: " + numbersList.get(currentIndex));
            currentIndex++;
        }

        // 3 - else print on  the screen the current thread name and that there are no more elements to print
        else {
            System.out.println(Thread.currentThread().getName() + "has nothing else to print");
        }
        // 4 - also consider that you have to update current Index to print the next number
    }

    // New helper: lets other classes safely ask "is there more?" without
    // touching currentIndex directly. Also synchronized, for the same
    // visibility/safety reasons as printNextNumber().
    public synchronized boolean hasNext() {
        return currentIndex < numbersList.size();
    }
    
}
