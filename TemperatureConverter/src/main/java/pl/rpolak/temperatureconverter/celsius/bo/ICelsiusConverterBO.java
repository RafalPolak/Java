package pl.rpolak.temperatureconverter.celsius.bo;

/**
 *
 * @author Rafal.Polak
 */
public interface ICelsiusConverterBO {

    public double toFahrenheit(double celsius);

    public double toKelvin(double celsius);

    public double toRankine(double celsius);

    public double toReaumur(double celsius);

}
