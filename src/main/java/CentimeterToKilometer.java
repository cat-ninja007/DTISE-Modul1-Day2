import java.util.Scanner;

public class CentimeterToKilometer {
    public void distance(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in Centimeter: ");
        float cm = scanner.nextFloat();
        float km = cm / 100000;
        System.out.println(cm + " centimeter is " + km + " kilometer");
    }
}
