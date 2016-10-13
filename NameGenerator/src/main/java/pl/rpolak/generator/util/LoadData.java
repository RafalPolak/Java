package pl.rpolak.generator.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;

/**
 *
 * @author Rafal.Polak
 */
public class LoadData {

    private Random random;

    public Name loadAndDrawNameSurname(int gender) {

        //Array for names and surnames
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();

        Name name = new Name("test", "test");
        random = new Random();

        String maleFile = "name-male.txt";
        String femaleFile = "name-female.txt";
        String surname = null;
        String filename = null;
        int nameSize = 0;

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
        nameSize = random.nextInt(names.size());
        name.setName(names.get(nameSize));

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

    public Credentials drawPassword(int lenght) {

        //alghoritm take small letter || upper letter || digit || special character
        ArrayList<Character> smallLetter = new ArrayList<>();
        ArrayList<Character> upperLetter = new ArrayList<>();
        ArrayList<Character> specialCharacter = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        Credentials credentials = new Credentials(null);

        random = new Random();

        //fill lists with letters
        for (int sign = 65; sign <= 90; sign++) {
            smallLetter.add((char) sign);
        }

        for (int sign = 97; sign <= 122; sign++) {
            upperLetter.add((char) sign);
        }

        //fill list with special character
        for (int sign = 33; sign <= 47; sign++) {
            specialCharacter.add((char) sign);
        }

        /*
        first loop for password lenght
        in loop draw small letter/upper letter/digit/special character
        next draw from array value
         */
        for (int counter = 0; counter <= lenght; counter++) {
            int whichArray = random.nextInt(4);

            if (whichArray == 0) {
                stringBuilder.append(smallLetter.get(random.nextInt(smallLetter.size())));
            }

            if (whichArray == 1) {
                stringBuilder.append(upperLetter.get(random.nextInt(upperLetter.size())));
            }

            if (whichArray == 2) {
                stringBuilder.append(random.nextInt(10));
            }

            if (whichArray == 3) {
                stringBuilder.append(specialCharacter.get(random.nextInt(specialCharacter.size())));
            }
        }

        System.out.println("Drawing password: " + stringBuilder.toString());

        credentials.setPassword(stringBuilder.toString());

        return credentials;
    }

}
