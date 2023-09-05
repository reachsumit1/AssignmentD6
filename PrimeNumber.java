package AssignmentDay6;
import java.util.Scanner;
    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Get the number from the user
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            // Check if the number is prime
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Print the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

