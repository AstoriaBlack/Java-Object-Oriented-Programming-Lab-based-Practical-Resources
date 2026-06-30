public class ThreadsBrocode {public static void main(String[] args) throws InterruptedException{

    // Create a subclass of Thread
    MyThread thread1 = new MyThread();

    //or

    //implement Runnable interface and pass instance as an argument to Thread()
    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1);


    //thread1.setDaemon(true);
    //thread2.setDaemon(true);

    thread1.start();
    //thread1.join(); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
    thread2.start();
    //thread2.start(); invokes IllegalThreadStateException if the thread is already started
    //still threads runs tho bc this is main program issue

    //System.out.println(1/0);
    ThreadToStop threadToStop = new ThreadToStop();
    threadToStop.start();

    threadToStop.sleep(100); //Let the thread run for a second before stopping it
    threadToStop.stopThread(); //Stop the thread gracefully
}
}

//*****************************************************