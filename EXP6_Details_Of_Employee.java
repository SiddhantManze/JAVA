import java.util.*;

class Employee {
    private int EmpNo;
    private String name;
    private double salary;

    public Employee(int EmpNo, String name, double salary) {
        this.EmpNo = EmpNo;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return EmpNo;
    }

    public void setEmployeeNumber(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void applySalaryEnhancement(double enhancementPercentage) {
        salary = salary * (1 + enhancementPercentage / 100);
    }
}

class Department {
    private String name;
    private Employee hod;

    public Department(String name, Employee hod) {
        this.name = name;
        this.hod = hod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee gethod() {
        return hod;
    }

    public void sethod(Employee hod) {
        this.hod = hod;
    }
}

public class EXP6_Details_Of_Employee {  // change it to Main
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ayush", 90000);
        Employee employee2 = new Employee(2, "Sahil", 80000);
        Department department1 = new Department("HR", employee1);
        Department department2 = new Department("MANAGER", employee2);
        employee1.applySalaryEnhancement(9);
        employee2.applySalaryEnhancement(7);
        System.out.println("Employee 1: " + employee1.getName() + ", Salary: " +
                employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getName() + ", Salary: " +
                employee2.getSalary());
        System.out.println("Department 1: " + department1.getName() + ", Head: " +
                department1.gethod().getName());
        System.out.println("Department 2: " + department2.getName() + ", Head: " +
                department2.gethod().getName());
    }
}