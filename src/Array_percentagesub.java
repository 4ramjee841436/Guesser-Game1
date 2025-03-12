import java.util.Scanner;
public class Array_percentagesub {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int total_marks = 0;
            int a[] = new int[12];
            System.out.println("Enter the subject marks:");

            for (int i = 0; i < 12; i++) {
                a[i] = sc.nextInt();
                total_marks += a[i];
            }

            System.out.println("Total marks is: " + total_marks);
            double per = (total_marks * 100.0) / 1200;
            System.out.println("The percentage of subject marks is: " + per);
        }
    }


