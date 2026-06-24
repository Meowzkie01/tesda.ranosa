import java.util.Scanner;

// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla class implementing Animal
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            System.out.println("Not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla... risky!");
    }
}

// Main class
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gorilla g = new Gorilla();

        // Ask about feeding
        System.out.print("Do you want to feed the gorilla? (yes/no): ");
        String feedAnswer = scanner.nextLine();
        if (feedAnswer.equalsIgnoreCase("yes")) {
            g.feed(true);
        } else {
            g.feed(false);
        }

        // Ask about grooming
        System.out.print("Do you want to groom the gorilla? (yes/no): ");
        String groomAnswer = scanner.nextLine();
        if (groomAnswer.equalsIgnoreCase("yes")) {
            g.groom();
        } else {
            System.out.println("You chose not to groom the gorilla.");
        }

        // Ask about petting
        System.out.print("Do you want to pet the gorilla? (yes/no): ");
        String petAnswer = scanner.nextLine();
        if (petAnswer.equalsIgnoreCase("yes")) {
            g.pet();
        } else {
            System.out.println("You chose not to pet the gorilla.");
        }

        scanner.close();
    }
}
