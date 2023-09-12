import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello Java!";

        System.out.println(helloWorld);
        System.out.println(helloWorld.charAt(0)+"ow are you?");

        float funkyFloat = 23.99f;
        int ohNoInt = (int) (funkyFloat+0.01f);// Add 0.01 to funkyFloat, then convert the sum to an int
        System.out.println(ohNoInt);

        /* Inputs */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = scanner.nextLine();

        System.out.println("Hello, "+input+"!");
         */

        // If and remainders
        float eooInput = 50f;
        float remainder = eooInput % 2;
        if(remainder==0){  // Practically, a switch statement might be better here
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        /* Switch Statements
        Don't use with floats, rounding errors
        Best with enums
         */

        int medalPlacement = 1;

        switch (medalPlacement) {
            case 1: System.out.println("GOLD"); break;
            case 2: System.out.println("SILVER"); break;
            case 3: System.out.println("BRONZE"); break;
            default: System.out.println("NO MEDAL"); break; // Loser
        }
    }
}