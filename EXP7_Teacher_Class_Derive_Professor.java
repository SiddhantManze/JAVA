import java.util.Scanner;

class Teacher {
    private String name;
    private String designation;
    private double salary;

    public Teacher(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Professor extends Teacher {
    public Professor(String name, double salary) {
        super(name, "Professor", salary);
    }
}

class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, double salary) {
        super(name, "Associate Professor", salary);
    }
}

class AssistantProfessor extends Teacher {
    public AssistantProfessor(String name, double salary) {
        super(name, "Assistant Professor", salary);
    }
}

public class EXP7_Teacher_Class_Derive_Professor {   // Change to T
    public static void main(String[] args) {
        Professor professor = new Professor("Ayush", 90000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Sahil", 80000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Kartik", 70000);
        System.out.println("Professor Information:\n");
        professor.displayInformation();
        System.out.println("Associate Professor Information:\n");
        associateProfessor.displayInformation();
        System.out.println("Assistant Professor Information:\n");
        assistantProfessor.displayInformation();
    }
}
