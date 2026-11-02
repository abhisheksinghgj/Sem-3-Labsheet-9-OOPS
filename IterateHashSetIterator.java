import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(101);
        set.add(202);
        set.add(303);

        System.out.println("Iterating HashSet using Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }
    }
}
