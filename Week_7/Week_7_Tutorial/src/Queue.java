import java.util.ArrayList;

// <T> after the class name is what makes this Generic
//T is a placeholder - whoever creates a queue decides what T actually
//e.g. Queue<String> means T = String everywhere in this class
//It compiles that way
public class Queue<T> {

    private int maxSize;           //maximum number of elements allowed
    private ArrayList<T> queue;    // the internal list that holds our elements

    //Constructor: sets the max size and initiates the empty ArrayList
    public Queue(int size) {
        maxSize = size;
        this.queue = new ArrayList<T>(); //creates an empty arrayList that holds the type T
    }

    //enque = add to the back of the queue (like joining the end of a line)
    //T value means we accept any value of whatever type T is
    public void enQueue(T value) {
        if (queue.size() == maxSize) {
            //if queue is full - can't add more
            System.out.println("Queue is full" + value);
        } else {
            queue.add(value);//adds to the back
            System.out.println("Enqueued: " + value);
        }
    }

    //dequeue = remove from the front of the queue
    //returns the T type again
    public T deQueue() {
        if(queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }else {
            //remove(0) removed the first element
            T removed = queue.remove(0);
            System.out.println("Dequeued: " + removed);
            return removed;//return it so the caller can use the value
        }
    }

    //toString: prints the queue from the front to back
    @Override
    public String toString() {
        if (queue.isEmpty()) {
            return "Queue is empty";
        }
        //build a neat string
        StringBuilder sb = new StringBuilder("Queue (front -> back): [");
        for (int i = 0; i < queue.size(); i++) {
            sb.append(queue.get(i));
            if (i < queue.size() - 1) {
                sb.append(" | "); //separator between elements
            }
        }
        sb.append(" ]");
        sb.append(" (size: " + queue.size() + "/" + maxSize + ")");
        return sb.toString();
    }
}
