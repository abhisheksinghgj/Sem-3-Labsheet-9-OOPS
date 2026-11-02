import java.util.LinkedList;

public class PrintLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");

        System.out.println("LinkedList Elements: " + animals);
    }
}
