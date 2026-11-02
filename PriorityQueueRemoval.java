import java.util.PriorityQueue;

public class PriorityQueueRemoval {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Initial Queue: " + pq);
        System.out.println("Removing elements (retrieved in min-heap natural order):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}
