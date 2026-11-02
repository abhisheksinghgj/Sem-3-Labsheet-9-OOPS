import java.util.LinkedList;

public class RetrieveFirstLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        System.out.println("LinkedList: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}
