import java.util.*;
interface StudentFactory {
    Student create(int id, String name);
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstRef {
    public static void main(String[] args) {
        StudentFactory factory = Student::new;
        Student s = factory.create(101, "Ankit");
        s.display();
    }
}


        
    