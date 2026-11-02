import java.util.LinkedList;

public class AddFirstLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Middle1");
        list.add("Middle2");

        System.out.println("Initial LinkedList: " + list);

        list.addFirst("Head");
        list.addLast("Tail");

        System.out.println("After addFirst and addLast: " + list);
    }
}
