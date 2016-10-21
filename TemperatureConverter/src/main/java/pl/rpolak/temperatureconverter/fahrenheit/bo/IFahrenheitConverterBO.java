package pl.rpolak.temperatureconverter.fahrenheit.bo;

/**
 *
 * @author Rafal.Polak
 */
public interface IFahrenheitConverterBO {

    public double toCelsius(double fahrenheit);

    public double toKelvin(double fahrenheit);

    public double toRankine(double fahrenheit);

    public double toReaumur(double fahrenheit);
}
