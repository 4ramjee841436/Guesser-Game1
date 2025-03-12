package practice_program.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Monkey_Bannana_Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read input values
        int b = Integer.parseInt(br.readLine());  // Number of bananas (not used in logic)
        int p = Integer.parseInt(br.readLine());  // Number of monkeys (not used in logic)
        int j = Integer.parseInt(br.readLine());  // Monkeys eating per banana
        int k = Integer.parseInt(br.readLine());  // Monkeys eating per peanut
        int m = Integer.parseInt(br.readLine());  // Total monkeys

        // Calculate how many monkeys eat bananas and peanuts
        int m_e_b = m / j;  // Monkeys eating bananas
        int m_e_p = m / k;  // Monkeys eating peanuts

        // Subtract the monkeys who have eaten from the total count
        int left_Monkey = m - (m_e_b + m_e_p);

        // Ensure the number of left monkeys is not negative
        if ((m% j!=0)||(m%k!=0)) {
            left_Monkey--;
        }

        System.out.println("Total left Monkey is: " + left_Monkey);
    }
}
