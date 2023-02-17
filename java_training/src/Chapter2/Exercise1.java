package Chapter2;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        int userInput;
        String result;
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Input a int val: ");
        userInput = intScanner.nextInt();

        result = (userInput % 2 == 0)? "even" : "odd";

        System.out.println(result);
    }
}
