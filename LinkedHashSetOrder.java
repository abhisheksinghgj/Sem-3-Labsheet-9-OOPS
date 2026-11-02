import java.util.LinkedHashSet;

public class LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Zebra");
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");

        System.out.println("LinkedHashSet maintains insertion order: " + set);
    }
}
