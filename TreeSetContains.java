import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        int searchVal = 20;
        System.out.println("TreeSet: " + set);
        System.out.println("Contains " + searchVal + "? " + set.contains(searchVal));
        System.out.println("Contains 50? " + set.contains(50));
    }
}
