public class ThreadToStop extends Thread {

    private boolean exit = false;
// This variable is used to control the thread's execution
    @Override
    public void run(){
        while(!exit){
            System.out.println("Thrad is running...");
        }
        System.out.println("Thread is stopped!");
    }
    public void stopThread(){
        exit = true;
    }
}
