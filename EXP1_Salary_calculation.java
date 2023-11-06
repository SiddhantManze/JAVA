import java.util.Scanner;

class EXP1_Salary_calculation {    // Change to Employee
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String EmpName;
        System.out.println("Enter Employee Name:");
        EmpName = sc.nextLine();
        System.out.println("Enter Employee Number:");
        int EmpNo = sc.nextInt();
        System.out.println("Enter Employee's Basic Salary:");
        double BasicSalary = sc.nextDouble();
        double DA = 0.7 * BasicSalary;
        System.out.println("DA: " + DA);
        double HRA = 0.3 * BasicSalary;
        System.out.println("HRA: " + HRA);
        double PF = 0.1 * BasicSalary;
        System.out.println("PF: " + PF);
        System.out.println("Enter CCA:");
        double CCA = sc.nextDouble();
        System.out.println("Enter PT:");
        double PT = sc.nextDouble();
        double GrossSalary = BasicSalary + DA + HRA + CCA;
        System.out.println("THE GROSS SALARY IS: " + GrossSalary);
        double NetSalary = GrossSalary - PF - PT;
        System.out.println("THE NET SALARY IS: " + NetSalary);
    }
}
