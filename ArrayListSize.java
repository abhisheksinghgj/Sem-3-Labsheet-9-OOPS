import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");

        System.out.println("ArrayList Elements: " + fruits);
        System.out.println("ArrayList Size: " + fruits.size());
    }
}
