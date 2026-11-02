import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println("Original List with Duplicates: " + list);

        Set<String> set = new HashSet<>(list);
        System.out.println("Converted Set (Duplicates Removed): " + set);
    }
}
