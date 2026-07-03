package threadsFundamental;

public class PrintNameThread extends Thread{
    // constructor
    // Thread's own constructor takes a name, which you can retrieve
    // later with getName(). Calling super(threadName) hands it up
    // to Thread's constructor to store it.
    PrintNameThread(String threadName) {
        super(threadName);
    }

    //run method
    // Overriding run() -- this is the code that actually executes
    // "on" this thread, once start() is called.
    public void run() {
        //print 10 times the name
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + this.getName());
        }
    }
}
