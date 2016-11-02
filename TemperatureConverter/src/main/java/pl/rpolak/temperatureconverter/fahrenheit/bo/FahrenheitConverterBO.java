package pl.rpolak.temperatureconverter.fahrenheit.bo;

import pl.rpolak.temperatureconverter.util.ConstantsForEquations;

/**
 *
 * @author Rafal.Polak
 */
public class FahrenheitConverterBO implements IFahrenheitConverterBO {

    /*
    The temperature in Celsius is equal to the temperature (F - 32 / 1.8)
     */
    @Override
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - ConstantsForEquations.CONSTANT_1) / ConstantsForEquations.CONSTANT_2;
    }

    /*
    The temperature in Kelvin is equal to the temperature (F + 459.67) / 1.8
     */
    @Override
    public double toKelvin(double fahrenheit) {
        return (fahrenheit + ConstantsForEquations.CONSTANT_5) / ConstantsForEquations.CONSTANT_2;
    }

    /*
    The temperature in Rankine is equal to the temperature F + 459.67
     */
    @Override
    public double toRankine(double fahrenheit) {
        return fahrenheit + ConstantsForEquations.CONSTANT_5;
    }

    /*
    The temperatue in Reaumur is equal to the temperature (F - 32)/2.25
     */
    @Override
    public double toReaumur(double fahrenheit) {
        return (fahrenheit - ConstantsForEquations.CONSTANT_1) / ConstantsForEquations.CONSTANT_6;
    }

}
