package pl.rpolak.generator;

import java.util.InputMismatchException;
import java.util.Scanner;
import pl.rpolak.generator.bo.GeneratorBO;

/**
 *
 * @author Rafal.Polak
 */
public class Generator {

    public static void main(String args[]) {

        /*
        First choose what we want to do generate name/password or both
        Next: 
            - if name then select man/women 
            - if password select lenght
         */
        int menuSelect = 1;
        int genderSelect = 0;
        int passwordLenght = 4;
        String nameData = null;
        String password = null;

        //Create console questions for generating name/password or both
        Scanner scanner = new Scanner(System.in);

        //Use generator from bussiness obejct to generate data
        GeneratorBO generator = new GeneratorBO();

        while (menuSelect != 0) {

            System.out.println("Welcome in generator name/password\n"
                    + "Options:\n"
                    + "1 --> generate name with surname\n"
                    + "2 --> generate password\n"
                    + "3 --> generate name with surname and password\n"
                    + "0 --> quit");

            try {
                menuSelect = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
            }

            System.out.println("Your selection: " + menuSelect + "\n");

            //Create console questions for choose gender/password length or both
            if (menuSelect == 1) {
                System.out.println("You choose to generate name with surname\n"
                        + "Options:\n"
                        + "1 --> male\n"
                        + "2 --> female\n");

                try {
                    genderSelect = scanner.nextInt();
                } catch (InputMismatchException inputMismatchException) {
                    throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
                }

                if (genderSelect != 1 || genderSelect != 2) {
                    throw new InputMismatchException("Wrong parameter !!!\nThere should be 1 or 2 ");
                }

                //Use generator
                nameData = generator.generateName(genderSelect).toString();
            }

            if (menuSelect == 2) {
                System.out.println("You choose to generate password\n"
                        + "How long should password be ?");

                try {
                    passwordLenght = scanner.nextInt();
                } catch (InputMismatchException inputMismatchException) {
                    throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
                }

                //Use generator
                password = generator.generateCredential(passwordLenght).toString();

            }

            if (menuSelect == 3) {
                System.out.println("You choose to generate name with suraname and password\n"
                        + "Options:\n"
                        + "1 --> male\n"
                        + "2 --> female\n");
                //toDo security for value != (1 and 2)

                genderSelect = scanner.nextInt();

                System.out.println("How long should password be?");

                passwordLenght = scanner.nextInt();

                nameData = generator.generateName(genderSelect).toString();
                password = generator.generateCredential(passwordLenght).toString();

            }

            if (menuSelect == 0) {
                System.exit(menuSelect);
            }

            System.out.println("Generated data:\n" + nameData + "\n" + password);
        }
    }

}
