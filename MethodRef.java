import java.util.*;
@FunctionalInterface
interface Calculators {
    int operate(int a, int b);
}

class Operation {
    static int add(int a, int b) {
        return a + b;
    }
}

public class MethodRef {
    public static void main(String[] args) {
        Calculators c = Operation::add;
        System.out.println(c.operate(10, 20));
    }
}

        
    