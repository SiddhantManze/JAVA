public class EXP5_Principle_Of_OOP { // change to Student
    private String name;
    private int age;
    private String address;

    public EXP5_Principle_Of_OOP() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        EXP5_Principle_Of_OOP[] students = new EXP5_Principle_Of_OOP[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new EXP5_Principle_Of_OOP();
            students[i].setInfo("Student" + (i + 1), 20 + i, "Address" + (i + 1));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Student" + (i + 1) + " Information:");
            students[i].displayInfo();
            System.out.println();
        }
    }
}
