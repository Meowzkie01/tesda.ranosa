import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        boolean repeat = true;

        while (repeat) {
            
            System.out.println("Please type a word:");
            String Wordko = sc.nextLine();

            StringBuilder sb = new StringBuilder(Wordko);
            String reversedWord = sb.reverse().toString();

            boolean Same2 = Wordko.equals(reversedWord);
           
            if (Same2) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }

            System.out.println("Do you want to try again? (yes/no)");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                repeat = false; 
                System.out.println("Okay, program ended.");
            }
        }

        sc.close();
    }
}
