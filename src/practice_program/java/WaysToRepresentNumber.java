package practice_program.java;

import java.util.*;

public class WaysToRepresentNumber {

    // Function to check if a number is prime


        // Function to check if a number is prime
        public static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        // Function to count numbers surrounded by prime numbers
        public static int countFavouriteNumbers(int[] arr) {
            int count = 0;

            for (int i = 1; i < arr.length - 1; i++) { // Avoid first and last elements
                if (isPrime(arr[i - 1]) && isPrime(arr[i + 1])) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input size
            int n = scanner.nextInt();
            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Output the count of favorite numbers
            System.out.println(countFavouriteNumbers(arr));

            scanner.close();
        }
    }
