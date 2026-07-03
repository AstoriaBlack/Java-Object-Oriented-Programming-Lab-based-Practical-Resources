package threadsFundamental;

public class RunnableThread {
    public static void main (String[] args) {

        //create the object threadsFundamental.PrintNameRunnable
        // Step 1: create the "job" objects (just data + a run() method,
        // NOT threads themselves)
        PrintNameRunnable printA = new PrintNameRunnable("A");
        PrintNameRunnable printB = new PrintNameRunnable("B");
        PrintNameRunnable printC = new PrintNameRunnable("C");

        //create the thread object
        // Step 2: wrap each job in an actual Thread object.
        // This is the part that's genuinely different from Part 1 --
        // here, Thread is a separate object, not something we extended.
        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);
        Thread threadC = new Thread(printC);

        //start the thread
        // Step 3: start() must be called on the Thread objects,
        // not on the Runnable objects (Runnable has no start() method at all).
        threadA.start();
        threadB.start();
        threadC.start();
        //the start() method has to be invoked after an object threadsFundamental.PrintNameRunnable has been instantiated

    }
}
