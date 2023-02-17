package Asessment2;
import java.util.*;
public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guessNum = 0, answer, playerGuess;
        String cont;
        boolean gameQuit = false;


        //Game logic starts
        while (!gameQuit) {
            System.out.println("Game Start!\n");
            answer = (int) (Math.random() * 100);

            while (true) {
                System.out.println("Make your guess (1-100): ");
                playerGuess = scan.nextInt();
                guessNum++;

                if (playerGuess == answer) {
                    System.out.println("Congrats you've won! Your total number of guesses was: " + guessNum +"\n");
                    break;
                } else if (playerGuess < answer) {
                    System.out.println("Your guess is wrong. Try again (Hint: The answer value is higher.)\n");
                }else {
                    System.out.println("Your guess is wrong. Try again (Hint: The answer value is lower.)\n");
                }
            }

            System.out.println("Would you like to play another round? (Y/N): ");

            cont = scan.next().toUpperCase();

            if(cont.equals("N")){
                System.out.println("Exiting...");
                gameQuit = true;
            }else{
                // reset number of guesses
                guessNum = 0;
                System.out.println("Next round starting...\n");
            }

        }
    }
}
