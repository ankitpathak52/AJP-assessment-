import java.util.*;
import java.util.stream.*;

class Students {
    int marks;
    String name;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Sorts {
    public static void main(String[] args) {
        List<Students> list = Arrays.asList(
            new Students("Ankit", 85),
            new Students("Aman", 40),
            new Students("Rahul", 70)
        );

        list.stream()
            .filter(s -> s.marks > 50)
            .forEach(s -> System.out.println(s.name));
    }
}

        
    