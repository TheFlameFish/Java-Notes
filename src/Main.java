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

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = scanner.nextLine();

        System.out.println("Hello, "+input+"!");
    }
}