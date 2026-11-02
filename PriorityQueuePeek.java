import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(35);
        pq.add(12);
        pq.add(89);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peeked First Element (Highest priority / smallest): " + pq.peek());
        System.out.println("Queue after peek (unchanged): " + pq);
    }
}
