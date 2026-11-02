import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");

        System.out.println("Before Update: " + cities);
        cities.set(1, "Bengaluru"); // Update element at index 1
        System.out.println("After Updating index 1 to 'Bengaluru': " + cities);
    }
}
