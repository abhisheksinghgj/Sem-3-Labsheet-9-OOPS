import java.util.HashSet;

public class RemoveFromHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Original HashSet: " + set);
        set.remove("Banana");
        System.out.println("After Removing 'Banana': " + set);
    }
}
