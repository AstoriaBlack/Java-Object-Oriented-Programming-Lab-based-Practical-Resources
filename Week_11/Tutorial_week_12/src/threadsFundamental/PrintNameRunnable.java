package threadsFundamental;

public class PrintNameRunnable implements Runnable{
    //instance variable
    String nameThread;

    //constructor
    public PrintNameRunnable(String nameThread) {
        // Just a plain instance variable now -- Runnable doesn't give us
        // getName() for free like Thread did, so we track the name ourselves.
        this.nameThread = nameThread;
    }
    //run method
    // Runnable only requires this one method: run().
    // Note: this class is NOT a Thread itself -- it just describes
    // what work should happen when a thread eventually runs it.
    public void run() {
        //print 10 times the name
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + nameThread);
        }
    }
}
