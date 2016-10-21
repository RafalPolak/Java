package pl.rpolak.temperatureconverter.kelvin.bo;

/**
 *
 * @author Rafal.Polak
 */
public interface IKelvinConverterBO {

    public double toCelsius(double kelvin);

    public double toFahrenheit(double kelvin);

    public double toRankine(double kelvin);

    public double toReaumur(double kelvin);

}
