package pl.rpolak.temperatureconverter.reaumur.bo;

import pl.rpolak.temperatureconverter.util.ConstantsForEquations;

/**
 *
 * @author Rafal.Polak
 */
public class ReaumurConverterBO implements IReaumurConverterBO {

    /*
    The temperature in Celsius is equal to the temperature Re * 1.25
     */
    @Override
    public double toCelsius(double reaumur) {
        return reaumur * ConstantsForEquations.CONSTANT_7;
    }

    /*
    The temperature in Fahrenheit is equal to the temperature Re * 2.25 + 32
     */
    @Override
    public double toFahrenheit(double reaumur) {
        return (reaumur * ConstantsForEquations.CONSTANT_6) + ConstantsForEquations.CONSTANT_1;
    }

    /*
    The temperature in Kelvin is equal to the temperature Re * 1.25 + 273.15
     */
    @Override
    public double toKelvin(double reaumur) {
        return (reaumur * ConstantsForEquations.CONSTANT_7) + ConstantsForEquations.CONSTANT_3;
    }

    /*
    The temperature in Rankine is equal to the temperature Re * 2.25 + 32 + 459.67
     */
    @Override
    public double toRankine(double reaumur) {
        return (reaumur * ConstantsForEquations.CONSTANT_6) + ConstantsForEquations.CONSTANT_1 + ConstantsForEquations.CONSTANT_5;
    }

}
