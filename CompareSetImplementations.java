import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareSetImplementations {
    public static void main(String[] args) {
        String[] data = {"Banana", "Apple", "Mango", "Cherry", "Apple"};

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String item : data) {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        System.out.println("HashSet (Unordered):       " + hashSet);
        System.out.println("LinkedHashSet (Inserted):  " + linkedHashSet);
        System.out.println("TreeSet (Sorted Order):    " + treeSet);
    }
}
