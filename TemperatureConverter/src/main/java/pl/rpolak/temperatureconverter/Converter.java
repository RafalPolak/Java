package pl.rpolak.temperatureconverter;

import java.util.InputMismatchException;
import java.util.Scanner;
import pl.rpolak.temperatureconverter.celsius.bo.CelsiusConverterBO;
import pl.rpolak.temperatureconverter.exception.IncorrectValueException;
import pl.rpolak.temperatureconverter.fahrenheit.bo.FahrenheitConverterBO;
import pl.rpolak.temperatureconverter.kelvin.bo.KelvinConverterBO;
import pl.rpolak.temperatureconverter.rankine.bo.RankineConverterBO;
import pl.rpolak.temperatureconverter.reaumur.bo.ReaumurConverterBO;

/**
 *
 * @author Rafal.Polak
 */
public class Converter {

    public static void main(String args[]) {

        /*
        First we choose from what temperature we want to convert
        Next we provide value
        After that we choose to what temperature we want at the end 
         */
        int menuSelect = 1;
        int converterSelect = 0;
        double userTemperature = 0.0;
        double convertedTemperature = 0.0;

        //Create console questions for generating name/password or both
        Scanner scanner = new Scanner(System.in);

        CelsiusConverterBO celsiusConverterBO = new CelsiusConverterBO();
        FahrenheitConverterBO fahrenheitConverterBO = new FahrenheitConverterBO();
        KelvinConverterBO kelvinConverterBO = new KelvinConverterBO();
        RankineConverterBO rankineConverterBO = new RankineConverterBO();
        ReaumurConverterBO reaumurConverterBO = new ReaumurConverterBO();

        while (menuSelect != 0) {

            System.out.println("Welcome in temperature converter\n+"
                    + "Options:\n"
                    + "1 --> Convert from Celsius\n"
                    + "2 --> Convert from Fahrenheit\n"
                    + "3 --> Convert from Kelvin\n"
                    + "4 --> Convert from Rankine\n"
                    + "5 --> Convert from Reaumur\n"
                    + "0 --> Exit program");

            try {
                menuSelect = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
            }

            if (menuSelect < 0 || menuSelect > 5) {
                throw new IncorrectValueException("You provide value not from range!!!");
            }

            System.out.println("Enter temperature: ");

            try {
                userTemperature = scanner.nextDouble();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
            }

            System.out.println("To what temperature you want to convert ?\n"
                    + "Options:\n"
                    + "1 --> Convert to Celsius\n"
                    + "2 --> Convert to Fahrenheit\n"
                    + "3 --> Convert to Kelvin\n"
                    + "4 --> Convert to Rankine\n"
                    + "5 --> Convert to Reaumur\n"
                    + "0 --> Exit program");

            try {
                converterSelect = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
            }

            if (converterSelect < 0 || converterSelect > 5) {
                throw new IncorrectValueException("You provide value not from range!!!");
            }

            switch (menuSelect) {
                case 1:
                    switch (converterSelect) {
                        case 1:
                            throw new IncorrectValueException("Wrong choice, you can't convert from Celsius to Celsius!!!");
                        case 2:
                            convertedTemperature = celsiusConverterBO.toFahrenheit(userTemperature);
                            break;
                        case 3:
                            convertedTemperature = celsiusConverterBO.toKelvin(userTemperature);
                            break;
                        case 4:
                            convertedTemperature = celsiusConverterBO.toRankine(userTemperature);
                            break;
                        case 5:
                            convertedTemperature = celsiusConverterBO.toReaumur(userTemperature);
                            break;
                    }
                    break;
                case 2:
                    switch (converterSelect){
                        case 1:
                            convertedTemperature = fahrenheitConverterBO.toCelsius(userTemperature);
                            break;
                        case 2:
                            throw new IncorrectValueException("Wrong choice, you can't convert from Fahrenheit to Fahrenheit!!!");
                        case 3:
                            convertedTemperature = fahrenheitConverterBO.toKelvin(userTemperature);
                            break;
                        case 4:
                            convertedTemperature = fahrenheitConverterBO.toRankine(userTemperature);
                            break;
                        case 5:
                            convertedTemperature = fahrenheitConverterBO.toReaumur(userTemperature);
                            break;
                    }
                    break;
                case 3:
                    switch(converterSelect){
                        case 1:
                            convertedTemperature = kelvinConverterBO.toCelsius(userTemperature);
                            break;
                        case 2:
                            convertedTemperature = kelvinConverterBO.toFahrenheit(userTemperature);
                            break;
                        case 3:
                            throw new IncorrectValueException("Wrong choice, you can't convert from Kelvin to Kelvin!!!");
                        case 4:
                            convertedTemperature = kelvinConverterBO.toRankine(userTemperature);
                            break;
                        case 5:
                            convertedTemperature = kelvinConverterBO.toReaumur(userTemperature);
                            break;
                    }
                    break;
                case 4:
                    switch(converterSelect){
                        case 1:
                            convertedTemperature = rankineConverterBO.toCelsius(userTemperature);
                            break;
                        case 2:
                            convertedTemperature = rankineConverterBO.toFahrenheit(userTemperature);
                            break;
                        case 3:
                            convertedTemperature = rankineConverterBO.toKelvin(userTemperature);
                            break;
                        case 4:
                            throw new IncorrectValueException("Wrong choice, you can't convert from Rankine to Rankine!!!");
                        case 5:
                            convertedTemperature = rankineConverterBO.toReaumur(userTemperature);
                            break;
                    }
                    break;
                case 5:
                    switch(converterSelect){
                        case 1:
                            convertedTemperature = reaumurConverterBO.toCelsius(userTemperature);
                            break;
                        case 2:
                            convertedTemperature = reaumurConverterBO.toFahrenheit(userTemperature);
                            break;
                        case 3:
                            convertedTemperature = reaumurConverterBO.toKelvin(userTemperature);
                            break;
                        case 4:
                            convertedTemperature = reaumurConverterBO.toRankine(userTemperature);
                            break;
                        case 5:
                            throw new IncorrectValueException("Wrong choice, you can't convert from Reaumur ro Reaumue!!!");
                    }
                    break;
            }
            
            System.out.println(userTemperature + " converted into " + convertedTemperature+"\n"
                    + "Would you like to convert another temperature (0 - no/1 - yes)");
            
            try {
                menuSelect = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                throw new InputMismatchException("Wrong parameter!!! " + inputMismatchException);
            }

        }

    }

}
