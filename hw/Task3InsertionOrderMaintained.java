package hw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task3InsertionOrderMaintained {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Philly");
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Atlanta");
        cities.add("Huston");

        cities.removeIf(n -> n.startsWith("A"));
        System.out.println(cities);

        Set<Student> students=new LinkedHashSet<>();
        students.add(new Student("James",564));
        students.add(new Student("Mike",154));
        students.add(new Student("Grant",888));

        for (Student student : students) {
            System.out.println(student.getName());
            student.displayId();
        }
    }
}

class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    void displayId(){
        System.out.println(id);
    }
}
