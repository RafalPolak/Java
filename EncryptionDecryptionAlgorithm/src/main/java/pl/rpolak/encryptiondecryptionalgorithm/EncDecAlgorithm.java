package pl.rpolak.encryptiondecryptionalgorithm;

import pl.rpolak.encryptiondecryptionalgorithm.bo.AlgorithmBO;
import pl.rpolak.encryptiondecryptionalgorithm.exception.IncorrectTextException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Rafal Polak on 15.07.2017.
 */
public class EncDecAlgorithm {


    public static void main(String args[]){

        /*
        Frist version cover BASE64 encode/decode
         */

        int menuSelect = 1;
        String encoded = null;
        String decoded = null;
        String text = null;


        //Scanner for take data from user
        Scanner scanner = new Scanner(System.in);


        while(menuSelect!=0){

            System.out.println("Welcome encode/decode program\n" +
                    "Options:\n" +
                    "1 --> encode your data\n" +
                    "2 --> decode your data\n" +
                    "0 --> exit");

            try{
                menuSelect = scanner.nextInt();
            }catch (InputMismatchException inputMismatchException){
                throw new InputMismatchException("Wrong parameter: " + inputMismatchException);
            }

            AlgorithmBO algorithmBO = new AlgorithmBO();

            //Option #1 encode data to encoded string
            if(menuSelect==1){
                System.out.println("Write text to encode: ");

                try{
                    text = scanner.next();
                } catch (IncorrectTextException incorrectTextException){
                    throw new IncorrectTextException("Wrong text: " + incorrectTextException);
                }

                encoded = algorithmBO.encode(text);
                System.out.println("Your encoded text: "+encoded);
            }

            //Option #2 decode data to decoded string
            if(menuSelect==2){
                System.out.println("Write text to decode: ");

                try{
                    text = scanner.next();
                }catch (IncorrectTextException incorrectTextException){
                    throw new IncorrectTextException("Wrong text: " + incorrectTextException);
                }

                decoded = algorithmBO.decode(text);
                System.out.println("Your decoded text: "+decoded);
            }

            if (menuSelect == 0) {
                System.exit(menuSelect);
            }
        }

    }

}
