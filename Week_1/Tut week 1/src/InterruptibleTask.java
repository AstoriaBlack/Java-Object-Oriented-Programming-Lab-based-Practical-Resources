public class InterruptibleTask implements Runnable{
    private static final int Repetition = 100;

    @Override
    public void run() {
        try {
            // Main work loop
            for (int i = 0; i <= Repetition && !Thread.interrupted(); i++) {
                // Simulate work
                System.out.println("Working on iteration " + i);
                Thread.sleep(100); // Simulate time-consuming task
            }
        } catch (InterruptedException e) {
            // Thread was interrupted during sleep
            System.out.println("Thread was interrupted during work");
        } finally {
            // Cleanup section (always executes)
            cleanup();
        }
    }

    private void cleanup() {
        System.out.println("Performing cleanup operations...");
        // Release resources, close files, etc.
    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(new InterruptibleTask());
        worker.start();

        // Let it run for a while then interrupt
        Thread.sleep(500);
        worker.interrupt(); // Request interruption
        worker.join(); // Wait for thread to finish
        //what does join do? It blocks the current thread (main) until the thread (worker) finishes execution

        System.out.println("Main thread completed");
    }
}
