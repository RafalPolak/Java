package pl.rpolak.temperatureconverter.rankine.bo;

/**
 *
 * @author Rafal.Polak
 */
public interface IRankineConverterBO {

    public double toCelsius(double rankine);

    public double toFahrenheit(double rankine);

    public double toKelvin(double rankine);

    public double toReaumur(double rankine);

}
