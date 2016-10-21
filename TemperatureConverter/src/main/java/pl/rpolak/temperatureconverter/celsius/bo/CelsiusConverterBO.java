package pl.rpolak.temperatureconverter.celsius.bo;

import pl.rpolak.temperatureconverter.util.ConstantsForEquations;

/**
 *
 * @author Rafal.Polak
 */
public class CelsiusConverterBO implements ICelsiusConverterBO {

    /*
    0 degrees Celsius is equal to 32 degrees Fahrenheit
        C * 1.8 + 32
     */
    @Override
    public double toFahrenheit(double celsius) {
        return (celsius * ConstantsForEquations.CONSTANT_2) + ConstantsForEquations.CONSTANT_1;
    }

    /*
    The temperature in Kelvin is equal to the temperature C + 273.15
     */
    @Override
    public double toKelvin(double celsius) {
        return celsius + ConstantsForEquations.CONSTANT_3;
    }

    @Override
    /*
    The temperature in Rankine is equal to the temperature C * 1.8 + 32 + 459.67
     */
    public double toRankine(double celsius) {
        return (celsius * ConstantsForEquations.CONSTANT_2) + ConstantsForEquations.CONSTANT_1 + ConstantsForEquations.CONSTANT_5;
    }

    /*
    The temperature in Reaumur is equal to the temperature C * 0.8
     */
    @Override
    public double toReaumur(double celsius) {
        return celsius * ConstantsForEquations.CONSTANT_4;
    }

}
