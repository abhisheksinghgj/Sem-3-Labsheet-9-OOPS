import java.util.TreeSet;

public class TreeSetSorted {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(42);
        treeSet.add(15);
        treeSet.add(88);
        treeSet.add(3);
        treeSet.add(27);

        System.out.println("TreeSet automatically sorts elements: " + treeSet);
    }
}
