package pl.rpolak.generator.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafal.Polak
 */
public class LoadData {

    public String loadAndChooseName(){
        
    //Array for data
    ArrayList<String> names = new ArrayList<String>();
    

    //Get file from resources folder
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource("imiona.txt").getFile());

	try (Scanner scanner = new Scanner(file)) {

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
                        System.out.println("TEST: "+line);
		}

		scanner.close();

	} catch (IOException e) {
		e.printStackTrace();
	}

        return "test";
    
    }
    
}
