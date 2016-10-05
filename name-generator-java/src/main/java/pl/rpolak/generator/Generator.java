package pl.rpolak.generator;

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
        Next if name then select man/women if password select lenght
        */
        
        int primarySelect = 0;
        int secondarySelect = 0;
        int passwordLenght = 4;
        String nameData = null;
        String password = null;
        
        //Create console questions for generating name/password or both
        Scanner scanner = new Scanner(System.in);
        
        //Use generator from bussiness obejct to generate data
        GeneratorBO generator = new GeneratorBO();
        
        System.out.println("Welcome in generator name/password\n"
                + "Options:\n"
                + "1 --> generate name with surname\n"
                + "2 --> generate password\n"
                + "3 --> generate name with surname and password\n"
                + "0 --> quit");
        
        primarySelect = scanner.nextInt();
        
        System.out.println("Your selection: "+primarySelect);
        
        //Create console questions for choose gender/password length or both
        
        if(primarySelect==1){
            System.out.println("You choose to generate name with surname\n"
                    + "Options:\n"
                    + "1 --> male\n"
                    + "2 --> female\n");
            
            //toDo security for value != (1 and 2)
            
            
            secondarySelect = scanner.nextInt();
            
            //Use generator
            nameData = generator.generateName(secondarySelect).toString();
        }
        
        if(primarySelect==2){
            System.out.println("You choose to generate password\n"
                    + "How long should password be ?\n");
            
            //toDo security for incorrect lenght or provided letter
            //toDo create password with special character
            
            secondarySelect = scanner.nextInt();
            
            //Use generator
            password = generator.generateCredential(secondarySelect).toString();
            
        }
        
        if(primarySelect==3){
            
        }
        
        
        System.out.println("Generated data:\nName --> "+nameData+"\nPassword --> "+password);
        
        
    }

}
