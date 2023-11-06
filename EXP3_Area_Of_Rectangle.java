import java.util.Scanner;

public class EXP3_Area_Of_Rectangle { // Change to Area
    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EXP3_Area_Of_Rectangle rectangle = new EXP3_Area_Of_Rectangle();
        System.out.println("Enter the length:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth:");
        int b = sc.nextInt();
        rectangle.setDim(l, b);
        int area = rectangle.getArea();
        System.out.println("AREA OF RECTANGLE: " + area);
    }
}
