package pl.rpolak.generator.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import pl.rpolak.generator.name.Name;

/**
 *
 * @author Rafal.Polak
 */
public class LoadData {

    public Name loadAndDrawNameSurname(int gender) {

        //Array for names and surnames
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> surnames = new ArrayList<String>();

        Name name = new Name("test", "test");
        Random random = new Random();

        String maleFile = "name-male.txt";
        String femaleFile = "name-female.txt";
        String surname = null;
        String filename = null;

        ClassLoader classLoader = getClass().getClassLoader();

        if (gender == 1) {
            filename = maleFile;
        }

        if (gender == 2) {
            filename = femaleFile;
        }

        //Load names from resources
        File file = new File(classLoader.getResource(filename).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                names.add(line);
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Draw name and set in object
        name.setName(names.get(random.nextInt(names.size())));

        //Load surnames from resources
        file = new File(classLoader.getResource("surname.txt").getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                surnames.add(line);
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Draw surname and replace end of word for proper male or female
        surname = surnames.get(random.nextInt(surnames.size()));

        if (gender == 2) {

            if (surname.contains("ski")) {
                surname = surname.replace("ski", "ska");
            }

            if (surname.contains("cki")) {
                surname = surname.replace("cki", "cka");
            }

            if (surname.contains("dzki")) {
                surname = surname.replace("dzki", "dzka");
            }

        }

        name.setSurname(surname);

        return name;

    }

}
