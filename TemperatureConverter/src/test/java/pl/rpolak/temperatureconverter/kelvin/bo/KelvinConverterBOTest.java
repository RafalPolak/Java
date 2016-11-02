package pl.rpolak.temperatureconverter.kelvin.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.temperatureconverter.util.ConstantsForTests;

/**
 *
 * @author Rafal.Polak
 */
public class KelvinConverterBOTest {

    public KelvinConverterBOTest() {
    }

    @Test
    public void shouldConvertFromKelvinToCelsius() {
        //given
        KelvinConverterBO kelvinConverterBO = new KelvinConverterBO();
        double tempToConvert = ConstantsForTests.KELVIN;
        double convertedTemp = 0.0;

        //when
        convertedTemp = kelvinConverterBO.toCelsius(tempToConvert);

        //then
        assertEquals(ConstantsForTests.CELSIUS, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromKelvinToFahrenheit() {
        //given
        KelvinConverterBO kelvinConverterBO = new KelvinConverterBO();
        double tempToConvert = ConstantsForTests.KELVIN;
        double convertedTemp = 0.0;

        //when
        convertedTemp = kelvinConverterBO.toFahrenheit(tempToConvert);

        //then
        assertEquals(ConstantsForTests.FAHRENHEIT, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromKelvinToRankine() {
        //given
        KelvinConverterBO kelvinConverterBO = new KelvinConverterBO();
        double tempToConvert = ConstantsForTests.KELVIN;
        double convertedTemp = 0.0;

        //when
        convertedTemp = kelvinConverterBO.toRankine(tempToConvert);

        //then
        assertEquals(ConstantsForTests.RANKINE, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromKelvinToReaumur() {
        //given
        KelvinConverterBO kelvinConverterBO = new KelvinConverterBO();
        double tempToConvert = ConstantsForTests.KELVIN;
        double convertedTemp = 0.0;

        //when
        convertedTemp = kelvinConverterBO.toReaumur(tempToConvert);

        //then
        assertEquals(ConstantsForTests.REAUMUR, convertedTemp, ConstantsForTests.DELTA);
    }

}
