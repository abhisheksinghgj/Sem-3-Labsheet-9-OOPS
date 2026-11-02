import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Phone");
        items.add("Tablet");
        items.add("Monitor");

        System.out.println("Original List: " + items);

        // Remove by index
        items.remove(1); // Removes "Phone"
        System.out.println("After removing element at index 1: " + items);

        // Remove by value
        items.remove("Tablet");
        System.out.println("After removing element by value 'Tablet': " + items);
    }
}
