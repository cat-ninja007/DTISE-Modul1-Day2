public class Main {
    public static void main(String[] args) {

        FahrenheitToCelcius fahrenheitToCelcius = new FahrenheitToCelcius();
        CentimeterToKilometer centimeterToKilometer = new CentimeterToKilometer();
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        RemoveSearchedStrings removeSearchedStrings = new RemoveSearchedStrings();
        Palindrome palindrome = new Palindrome();



        fahrenheitToCelcius.convert();
        centimeterToKilometer.distance();
        checkEvenOdd.check();    // Run the checkEvenOdd mini-program
        removeSearchedStrings.check();
        palindrome.check();
    }
}
