package producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class MessageQueue {
    //the size of the buffer
    private int bufferSize;

    //the buffer list of the message, assuming the string message format
    private List<String> buffer = new ArrayList<String>();

    //construct the message queue with given buffer size
    public MessageQueue (int bufferSize) {
        this.bufferSize = bufferSize;
    }

    //check whether the buffer is full
    public synchronized boolean isFull() {
        return buffer.size() == bufferSize;
    }

    //check whether the buffer is empty
    public synchronized boolean isEmpty() {
        return buffer.size() == 0;
    }

    //put an income message into the queue, called by message producer
    public synchronized void put(String message) {
        // while, not if -- when this thread wakes back up from wait(),
        // we re-check the condition, because another producer thread
        // (if there were more than one) might have filled the buffer
        // again in the meantime.
        while(isFull()) {
            try {
                wait(); //releases the lock and pauses THIS thread here
                        //until some other thread calls notifyAll()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(message);
        System.out.println(("Produced: "+ message));

        // Wake up any Consumer threads that might be stuck in get()
        //waiting for the buffer to stop being empty.
        notifyAll();
    }

    //get a message from the queue, called by the message consumer
    public synchronized String get() {
        while(isEmpty()) {
            try {
                wait();// pause here until the Producer adds something
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String message = buffer.removeFirst(); // take the oldest message (FIFO order)
        //and store it inside a variable

        // Wake up any Producer threads that might be stuck in put()
        // waiting for space to free up.
        notifyAll();

        return message;
    }
}
