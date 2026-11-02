import java.util.ArrayList;

public class InsertAtIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Before Insertion: " + colors);
        colors.add(1, "Yellow"); // Insert at index 1
        System.out.println("After Insertion at index 1: " + colors);
    }
}
