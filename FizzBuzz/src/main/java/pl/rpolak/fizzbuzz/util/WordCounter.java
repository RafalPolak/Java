package pl.rpolak.fizzbuzz.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal Polak on 08.04.2018.
 */
public class WordCounter {

    public static int checkOccurs(String word, String sentence) {

        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(sentence);
        int count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }

}
