java.util.LinkedList;
import java.util.Queue;

public class QueueOperationsDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();

        // Add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue after offers: " + queue);

        // Peek
        System.out.println("Peek top element: " + queue.peek());

        // Remove
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
