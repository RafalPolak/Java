package pl.rpolak.playground;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Playground {

    public static void main(String args[]){
        String simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).format(new Date());
        String simpleDateFormatTimezone = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(new Date());
        System.out.println("output date: " + simpleDateFormat);
        System.out.println("output timezone: " + simpleDateFormatTimezone);
    }
}
