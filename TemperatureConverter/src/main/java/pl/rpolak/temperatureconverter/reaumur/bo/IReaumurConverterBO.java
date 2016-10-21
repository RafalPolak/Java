package pl.rpolak.temperatureconverter.reaumur.bo;

/**
 *
 * @author Rafal.Polak
 */
public interface IReaumurConverterBO {

    public double toCelsius(double reaumur);

    public double toFahrenheit(double reaumur);

    public double toKelvin(double reaumur);

    public double toRankine(double reaumur);

}
