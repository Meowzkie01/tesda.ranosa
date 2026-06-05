import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int runCount = 0; 
        boolean repeat = true;

        while (repeat) {

            System.out.println("Enter three numbers separated by spaces:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();


            if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal");
            } else if (num1 >= num2 && num1 >= num3) {
                System.out.println("Largest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("Largest number is: " + num2);
            } else {
                System.out.println("Largest number is: " + num3);
            }

            runCount++; 

            if (runCount >= 2) {
                System.out.println("Do you want to try again? (yes/no)");
                String answer = sc.next();

                if (answer.equalsIgnoreCase("no")) {
                    repeat = false;
                    System.out.println("Okay, program ended.");
                }
            }
        }

        sc.close();
    }
}
