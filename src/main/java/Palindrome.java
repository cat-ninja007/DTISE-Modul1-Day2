import java.util.Scanner;

public class Palindrome {
    public void check(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputString = scanner.nextLine();

        StringBuilder reversing = new StringBuilder(inputString);

        String reversedString = reversing.reverse().toString();
        String isPalindrome;
        if(inputString.equals(reversedString)){
            isPalindrome = "This word is Palindrome";
        } else {
            isPalindrome = "NOT Palindrome";
        }
        System.out.println(isPalindrome);
    }
}
