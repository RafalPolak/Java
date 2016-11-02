package pl.rpolak.temperatureconverter.kelvin.bo;

import pl.rpolak.temperatureconverter.util.ConstantsForEquations;

/**
 *
 * @author Rafal.Polak
 */
public class KelvinConverterBO implements IKelvinConverterBO {

    /*
    The temperature in Celsius is equal to the temperature K - 273.15
     */
    @Override
    public double toCelsius(double kelvin) {
        return kelvin - ConstantsForEquations.CONSTANT_3;
    }

    /*
    The temperature in Fahrenheit is equal to the temperature K * 1.8 - 459.67
     */
    @Override
    public double toFahrenheit(double kelvin) {
        return (kelvin * ConstantsForEquations.CONSTANT_2) - ConstantsForEquations.CONSTANT_5;
    }

    /*
    The temperature in Rankine is equal to the temperature K * 1.8
     */
    @Override
    public double toRankine(double kelvin) {
        return kelvin * ConstantsForEquations.CONSTANT_2;
    }

    /*
    The temperature in Reaumur is equal to the temperature (K - 273.15) * 0.8
     */
    @Override
    public double toReaumur(double kelvin) {
        return (kelvin - ConstantsForEquations.CONSTANT_3) * ConstantsForEquations.CONSTANT_4;
    }

}
