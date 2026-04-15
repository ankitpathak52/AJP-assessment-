import java.util.ArrayList;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Rahul", 85));
        list.add(new Student(2, "Aman", 90));
        list.add(new Student(3, "Priya", 88));
        list.add(new Student(4, "Sneha", 92));
        list.add(new Student(5, "Karan", 75));
        System.out.println("ID\tName\tMarks");
        System.out.println("------------------------");

        for (Student s : list) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.marks);
        }
    }
}
