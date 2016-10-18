package pl.rpolak.higherlower;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rafal.Polak
 */
public class HigherLower {

    public static void main(String args[]) {

        int trials = 0;
        int range = 199;
        int drawNumber = 0;
        int selection = 0;
        boolean isEquals = false;
        boolean isContinue = true;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println(
                "Welcome in Higher/Lower game\n"
                + "Rules:\n"
                + "- number is from range 0-200\n"
                + "- after successfully guessing, program shows how many trials you had done to guess number\n\n"
                + "Let's play:\n"
                + "What's number is on my mind ?");

        drawNumber = random.nextInt(range);

        while (isEquals == false) {

            try {
                selection = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter: " + inputMismatchException);
            }

            if (selection == drawNumber) {
                System.err.println("That's the correct number\n"
                        + "Trials: " + trials);
                isEquals = true;
                break;
            }

            if (selection < drawNumber) {
                System.out.println("Your number is too low");
                trials++;
            }

            if (selection > drawNumber) {
                System.out.println("Your number is too high");
                trials++;
            }

            System.out.println("Continue game true/false ?");

            try {
                isContinue = scanner.nextBoolean();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter " + inputMismatchException);
            }

            if (!isContinue) {
                System.out.println("your trials: " + trials + "\nThe draw number " + drawNumber);
                break;
            }

            System.out.println("What's number is on my mind ?");

        }

    }

}
