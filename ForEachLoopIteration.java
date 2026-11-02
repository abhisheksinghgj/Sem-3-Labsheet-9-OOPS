import java.util.ArrayList;

public class ForEachLoopIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        System.out.println("Iterating using for-each loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}
