import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //
        System.out.println("We have 2 method of Randomizer.");
        System.out.println("'First' method, from 0 till *specific number*.");
        System.out.println("'Second' method, from *min number* till *max number*.");
        System.out.println("If you would try on of this methods, write this..");
        System.out.println("First/Second method. For example:");
        System.out.println("-----------------------------------");
        System.out.println("First");
        // main lore

        //
        Random randomInt = new Random();
        int mainInt = 101;
        // generate random values from 0-100
        int mainRandomInt = randomInt.nextInt(mainInt);
        System.out.println("Specific number is: " + (mainInt-1) );
        System.out.println("Your number: " + mainRandomInt);
        System.out.println("-----------------------------------");
        System.out.println("");
        // example Random number

        //
        System.out.print("Type here method: ");
        Scanner personalChoice = new Scanner(System.in);
        String choice;
        String choice1 = "first";
        String choice2 = "second";

        choice = personalChoice.nextLine();
        // person chose one of the method

        int i = 1;

        while (i < 2) {
            if (choice.equalsIgnoreCase(choice1)) {
                //
                int mainInt1;

                System.out.print("Type here number: ");
                Scanner scannerInt = new Scanner(System.in);
                mainInt1 = scannerInt.nextInt();

                Random randomInt1 = new Random();
                // -generate random values from 0-*specific number*
                int mainRandomInt1 = randomInt1.nextInt(mainInt1+1);
                System.out.println("Generated number: " + mainRandomInt1);
                System.out.println("");
                // first method
            } else if (choice.equalsIgnoreCase(choice2)) {
                //
                int min, max;
                // -generate random int value from *min* to *max*

                System.out.print("Type here (!)MIN number: ");
                Scanner minInt = new Scanner(System.in);
                min = minInt.nextInt();

                System.out.print("Type here (!)MAX number: ");
                Scanner maxInt = new Scanner(System.in);
                max = maxInt.nextInt();
                // -min & max number

                System.out.println("Random value in int from "+min+" to "+max+ ":");
                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                System.out.println("Generated number: " + random_int);
                System.out.println("");
                // second method
            } else {
                System.out.println("Error");
                System. exit(1);
            }
        }
    }
}