import java.util.Scanner;

public class RemoveSearchedStrings {
    public void check(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String string = scanner.nextLine();

        System.out.print("Enter the string you want to remove: ");
        String searchString = scanner.nextLine();

        int index = string.indexOf(searchString);

        String result;

        if(index != -1){
            result = string.substring(0, index) + string.substring(index + searchString.length());
        } else {
            result = string;
        }

        System.out.println("Resulting string: " + result);
    }
}
