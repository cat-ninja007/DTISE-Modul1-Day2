import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Asking for a string input
        System.out.print("Enter the temperature in Fahrenheit: ");
        String temperatureFahrenheit = scanner.nextLine();



        // Asking for an integer input
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();

        // Asking for a double input
//        System.out.print("Enter your height in meters: ");
//        double height = scanner.nextDouble();

        // Output the collected inputs
        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " meters tall.");

        // Close the scanner
        scanner.close();
    }
}
