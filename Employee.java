// Experiment : 04
// CONSTRUCTOR CHAINING

import java.util.*;

class Employee {
    Employee() {
        System.out.println("THE EMPLOYEE ID: 62");
    }

    Employee(int S) {
        this();
        System.out.println("THE BASIC SALARY IS " + S);
    }

    Employee(int S, int G) {
        this(S);
        System.out.println("THE GROSS SALARY IS " + G);
    }

    public static void main(String args[]) {
        new Employee(100000, 70000);
    }
}
