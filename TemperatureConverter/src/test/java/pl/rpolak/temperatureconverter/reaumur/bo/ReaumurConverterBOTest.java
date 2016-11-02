package pl.rpolak.temperatureconverter.reaumur.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.temperatureconverter.util.ConstantsForTests;

/**
 *
 * @author Rafal.Polak
 */
public class ReaumurConverterBOTest {

    public ReaumurConverterBOTest() {
    }

    @Test
    public void shouldConvertFromReaumurToCelsius() {
        //given
        ReaumurConverterBO reaumurConverterBO = new ReaumurConverterBO();
        double tempToConvert = ConstantsForTests.REAUMUR;
        double convertedTemp = 0.0;

        //when
        convertedTemp = reaumurConverterBO.toCelsius(tempToConvert);

        //then
        assertEquals(ConstantsForTests.CELSIUS, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromReaumurToFahrenheit() {
        //given
        ReaumurConverterBO reaumurConverterBO = new ReaumurConverterBO();
        double tempToConvert = ConstantsForTests.REAUMUR;
        double convertedTemp = 0.0;

        //when
        convertedTemp = reaumurConverterBO.toFahrenheit(tempToConvert);

        //then
        assertEquals(ConstantsForTests.FAHRENHEIT, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromReaumurToKelvin() {
        //given
        ReaumurConverterBO reaumurConverterBO = new ReaumurConverterBO();
        double tempToConvert = ConstantsForTests.REAUMUR;
        double convertedTemp = 0.0;

        //when
        convertedTemp = reaumurConverterBO.toKelvin(tempToConvert);

        //then
        assertEquals(ConstantsForTests.KELVIN, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromReaumurToRankine() {
        //given
        ReaumurConverterBO reaumurConverterBO = new ReaumurConverterBO();
        double tempToConvert = ConstantsForTests.REAUMUR;
        double convertedTemp = 0.0;

        //when
        convertedTemp = reaumurConverterBO.toRankine(tempToConvert);

        //then
        assertEquals(ConstantsForTests.RANKINE, convertedTemp, ConstantsForTests.DELTA);
    }

}
