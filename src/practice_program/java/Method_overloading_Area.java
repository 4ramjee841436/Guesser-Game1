package practice_program.java;
import java.util.Scanner;
public class Method_overloading_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        double s = sc.nextDouble();
        Area areaCalculator = new Area();

        // Call the appropriate method based on the argument type
        areaCalculator.area(s);
    }
}
class Area {
    void area(double s) {
        System.out.println("Area of square is: " + s * s);
    }
    void area(float s) {
        System.out.println("Area of square is: " + s * s);
    }
}
