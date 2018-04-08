package pl.rpolak.calculateage;

import java.util.InputMismatchException;
import java.util.Scanner;
import pl.rpolak.calculateage.bo.CalculateAgeBO;

/**
 *
 * @author Rafal.Polak
 */
public class Calculate {

    public static void main(String args[]) {

        final String ERROR_MESSAGE = "Wrong type!!!";

        String birth = null;
        long calculatedAge = 0;

        boolean isEnd = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to age calculator\n"
                + "Write your birth date in format day/month/year\nExample 01/01/1987");

        while (isEnd) {

            try {
                birth = scanner.nextLine();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException(ERROR_MESSAGE + " " + inputMismatchException);
            }

            CalculateAgeBO calculateAgeBO = new CalculateAgeBO();

            calculatedAge = calculateAgeBO.ageInSeconds(birth);

            System.out.println("Your age in seconds: " + calculatedAge + "\nWould you like to convert another date? true/false");

            try {
                isEnd = scanner.nextBoolean();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException(ERROR_MESSAGE + " " + inputMismatchException);
            }

            if (isEnd == true) {
                System.out.println("Write your birth date in format day/month/year\nExample 01/01/1987");
                try {
                    birth = scanner.nextLine();
                } catch (InputMismatchException inputMismatchException) {
                    throw new InputMismatchException(ERROR_MESSAGE + " " + inputMismatchException);
                }
            }

        }
    }

}
