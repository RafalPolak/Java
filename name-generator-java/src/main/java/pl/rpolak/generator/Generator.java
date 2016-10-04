package pl.rpolak.generator;

import java.util.Scanner;
import pl.rpolak.generator.bo.GeneratorBO;

/**
 *
 * @author Rafal.Polak
 */
public class Generator {
    
    public static void main(String args[]) {

        int selection = 0;
        String nameData = null;
        String password = null;
        
        //Create console questions for generating name/password or both
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome in generator name/password\n"
                + "Options:\n"
                + "1 --> generate name with surname\n"
                + "2 --> generate password\n"
                + "3 --> generate name with surname and password\n"
                + "0 --> quit");
        
        selection = scanner.nextInt();
        
        System.out.println("Your selection: "+selection);
        
        //Use generator from bussiness obejct to generate data
        GeneratorBO generator = new GeneratorBO();
        
        nameData = generator.generateName().toString();
        password = generator.generateCredential().toString();
        
        System.out.println("Generated data:\nName --> "+nameData+"\nPassword --> "+password);
        
        
    }

}
