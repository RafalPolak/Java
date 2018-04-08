package pl.rpolak.calculateage.bo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import pl.rpolak.calculateage.exception.IncorrectValueException;

/**
 *
 * @author Rafal.Polak
 */
public class CalculateAgeBO implements ICalculateAgeBO {

    @Override
    public long ageInSeconds(String birth) {

        long systemTime = System.currentTimeMillis();
        long age = 0;

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date date = dateFormat.parse(birth);

            age = systemTime - date.getTime();

        } catch (ParseException parseException) {
            throw new IncorrectValueException("Incorrect format!!!");
        }

        return age;
    }

}
