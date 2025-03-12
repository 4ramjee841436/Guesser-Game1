package practice_program.java;
import java.util.Scanner;
 class This_Keyword {
    String Roll_no;
    String Name;

    This_Keyword(String Roll_no, String name) {
        this.Roll_no = Roll_no;
        this.Name = name;
    }
    void display() {
        System.out.println("Roll number: " + this.Roll_no);
        System.out.println("Name: " + this.Name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll number:");
        String roll_no = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your Name:");
        String name = sc.nextLine();  //
        This_Keyword obj = new This_Keyword(roll_no, name);  // Create an object using the constructor
        obj.display();  // Call the display() method on the object
    }
}
