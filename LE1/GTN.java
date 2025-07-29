import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Find and print the greater number
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
