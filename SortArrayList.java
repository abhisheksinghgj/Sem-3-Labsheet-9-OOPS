import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(3);
        numbers.add(27);

        System.out.println("Before Sorting: " + numbers);
        Collections.sort(numbers); // Sort in ascending order
        System.out.println("After Ascending Sort: " + numbers);
    }
}
