import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + ''' + ", gpa=" + gpa + '}';
    }
}

public class CustomObjectComparatorSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(103, "Charlie", 3.5));
        list.add(new Student(101, "Alice", 3.9));
        list.add(new Student(102, "Bob", 3.7));

        System.out.println("Before Sorting: " + list);

        // Sort by GPA descending using Comparator
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.gpa, s1.gpa);
            }
        });

        System.out.println("Sorted by GPA (Descending): " + list);
    }
}
