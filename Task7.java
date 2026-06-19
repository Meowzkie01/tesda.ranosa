import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter 1st number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter 2nd number: ");
            double num2 = sc.nextDouble();

            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));

            System.out.print("\nDo you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);

            System.out.println(); // blank line between runs
        } while (choice == 'Y' || choice == 'y');

        sc.close();
        System.out.println("The End!.");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}