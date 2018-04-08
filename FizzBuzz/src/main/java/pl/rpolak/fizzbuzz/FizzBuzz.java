package pl.rpolak.fizzbuzz;

import pl.rpolak.fizzbuzz.bo.FizzBuzzBO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Rafal Polak on 25.11.2017.
 */
public class FizzBuzz {

    public static void main(String args[]){


        String output;
        long number;
        boolean isEnd = true;

        Scanner scanner = new Scanner(System.in);


        while(isEnd){

            System.out.println("Welcome to Fizz Buzz program\n" +
                                "Write number to check");

            try {
                number = scanner.nextLong();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter !!!" + inputMismatchException);
            }

            FizzBuzzBO fizzBuzzBO = new FizzBuzzBO();

            output = fizzBuzzBO.recognizeWords(number);

            System.out.println(output + "\nWould you like to try again? (Write true or false)");

            try {
                isEnd = scanner.nextBoolean();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter !!!" + inputMismatchException);
            }

            if (!isEnd) {
                break;
            }

        }

    }

}
