package producer_consumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        // A small buffer (size 3) makes it easy to actually observe the
        // Producer being forced to wait when the Consumer falls behind.

        MessageQueue queue = new MessageQueue(3);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
