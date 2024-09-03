import java.util.Scanner;

public class FahrenheitToCelcius {
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float tempFahrenheit = scanner.nextFloat();
        float convertTemperature = (tempFahrenheit - 32) * 5/9;
        System.out.println(tempFahrenheit + " Fahrenheit is " + convertTemperature + " in Celcius");
    }
}
