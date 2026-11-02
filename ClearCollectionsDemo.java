import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ClearCollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        Queue<String> queue = new LinkedList<>();
        queue.add("X");
        queue.add("Y");

        System.out.println("Before Clear:");
        System.out.println("List: " + list + ", Set: " + set + ", Queue: " + queue);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("After Clear:");
        System.out.println("List isEmpty? " + list.isEmpty() + " (" + list + ")");
        System.out.println("Set isEmpty? " + set.isEmpty() + " (" + set + ")");
        System.out.println("Queue isEmpty? " + queue.isEmpty() + " (" + queue + ")");
    }
}
