package TNP_Techmical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat_MouseProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the position of Cat A: ");
        int x = Integer.parseInt(br.readLine().trim());

        System.out.print("Enter the position of Cat B: ");
        int y = Integer.parseInt(br.readLine().trim());

        System.out.print("Enter the position of the Mouse: ");
        int z = Integer.parseInt(br.readLine().trim());

        // Calculate distances from each cat to the mouse
        int distanceA = Math.abs(z - x);
        int distanceB = Math.abs(z - y);


        if (distanceA < distanceB) {
            System.out.println("Cat A catches the mouse.");
        } else if (distanceB < distanceA) {
            System.out.println("Cat B catches the mouse.");
        } else {
            System.out.println("The mouse escapes as both cats " );
        }
    }
}
