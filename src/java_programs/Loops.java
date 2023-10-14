package java_programs;
import java.util.*;

public class Loops {
	//FactorialCalculator
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate factorial using while loop
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial using while loop: " + factorial);

        // Calculate factorial using do-while loop
        int factorial1 = 1;
        int j = 1;
        do {
            factorial1 *= j;
            j++;
        } while (j <= number);
        System.out.println("Factorial using do-while loop: " + factorial1);

        // Calculate factorial using for loop5
        int factorial2 = 1;
        for (int k = 1; k <= number; k++) {
            factorial2 *= k;
        }
        System.out.println("Factorial using for loop: " + factorial2);
    }
}


