import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        String favfood = new String("Tomatoes");
        System.out.println(favfood);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int niger = scanner.nextInt();
        System.out.println("How many days are in a year?");
        int days = scanner.nextInt();
        int total = niger*days*24*60*60;
        System.out.println("This is the amount of seconds you've been alive:  " +total);
    }
}