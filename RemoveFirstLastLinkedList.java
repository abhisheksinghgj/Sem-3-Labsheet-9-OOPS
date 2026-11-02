import java.util.LinkedList;

public class RemoveFirstLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        System.out.println("Original LinkedList: " + list);

        String removedFirst = list.removeFirst();
        String removedLast = list.removeLast();

        System.out.println("Removed First: " + removedFirst);
        System.out.println("Removed Last: " + removedLast);
        System.out.println("Remaining LinkedList: " + list);
    }
}
