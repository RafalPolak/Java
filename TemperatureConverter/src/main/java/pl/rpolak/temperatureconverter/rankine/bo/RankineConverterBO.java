package pl.rpolak.temperatureconverter.rankine.bo;

import pl.rpolak.temperatureconverter.util.ConstantsForEquations;

/**
 *
 * @author Rafal.Polak
 */
public class RankineConverterBO implements IRankineConverterBO {

    /*
    The temperature in Celsius is equal to the temperature (Ra - 32 - 459.67) / 1.8
     */
    @Override
    public double toCelsius(double rankine) {
        return (rankine - ConstantsForEquations.CONSTANT_1 - ConstantsForEquations.CONSTANT_5) / ConstantsForEquations.CONSTANT_2;
    }

    /*
    The temperature in Fahrenheit is equal to the temperature Ra - 459.67
     */
    @Override
    public double toFahrenheit(double rankine) {
        return rankine - ConstantsForEquations.CONSTANT_5;
    }

    /*
    The temperature in Kelvin is equal to the temperature Ra / 1.8
     */
    @Override
    public double toKelvin(double rankine) {
        return rankine / ConstantsForEquations.CONSTANT_2;
    }

    /*
    The temperature in Reaumur is equal to the temperature (Ra - 32 - 459.67) / 2.25
     */
    @Override
    public double toReaumur(double rankine) {
        return (rankine - ConstantsForEquations.CONSTANT_1 - ConstantsForEquations.CONSTANT_5) / ConstantsForEquations.CONSTANT_6;
    }

}
