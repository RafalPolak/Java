package pl.rpolak.headstails;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import pl.rpolak.headstails.exception.IncorrectValueException;

/**
 *
 * @author Rafal.Polak
 */
public class HeadsTails {

    public static void main(String args[]) {

        int RANGE_FOR_RANDOM = 2;
        int choice = 0;
        int draw = 0;
        int trials = 0;
        int correct = 0;
        int incorrect = 0;
        boolean isEnd = true;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        while (isEnd) {
            System.out.println("Welcome in game Heads or Tails\n"
                    + "Heads or Tails ? (press 0 for heads, press 1 for tail)");

            draw = random.nextInt(RANGE_FOR_RANDOM);

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter !!!" + inputMismatchException);
            }

            if (choice != 0 && choice != 1) {
                throw new IncorrectValueException("Value must be 0 or 1");
            }

            System.out.println("Draw: " + draw + "\n"
                    + "Yout choice: " + choice + "\n"
                    + "Would you like to try again? (Write true or false");

            try {
                isEnd = scanner.nextBoolean();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter !!!" + inputMismatchException);
            }

            if (isEnd) {

                if (draw == choice) {
                    correct++;
                }

                if (draw != choice) {
                    incorrect++;
                }

                trials++;
            }

            if (!isEnd) {
                System.out.println("Your trials: " + trials + "\n"
                        + "Correct: " + correct + "\n"
                        + "Incorrect: " + incorrect);
                break;
            }

        }

    }

}
