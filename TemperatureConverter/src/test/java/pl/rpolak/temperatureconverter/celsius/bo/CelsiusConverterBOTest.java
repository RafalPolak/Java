package pl.rpolak.temperatureconverter.celsius.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.temperatureconverter.util.ConstantsForTests;

/**
 *
 * @author Rafal.Polak
 */
public class CelsiusConverterBOTest {

    public CelsiusConverterBOTest() {
    }

    @Test
    public void shouldConvertFromCelsiusToFahrenheit() {
        //given
        CelsiusConverterBO celsiusConverterBO = new CelsiusConverterBO();
        double tempToConvert = ConstantsForTests.CELSIUS;
        double convertedTemp = 0.0;

        //when
        convertedTemp = celsiusConverterBO.toFahrenheit(tempToConvert);

        //then
        assertEquals(ConstantsForTests.FAHRENHEIT, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromCelsiusToKelvin() {
        //given
        CelsiusConverterBO celsiusConverterBO = new CelsiusConverterBO();
        double tempToConvert = ConstantsForTests.CELSIUS;
        double convertedTemp = 0.0;

        //when
        convertedTemp = celsiusConverterBO.toKelvin(tempToConvert);

        //then
        assertEquals(ConstantsForTests.KELVIN, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromCelsiusToRankine() {
        //given
        CelsiusConverterBO celsiusConverterBO = new CelsiusConverterBO();
        double tempToConvert = ConstantsForTests.CELSIUS;
        double convertedTemp = 0.0;

        //when
        convertedTemp = celsiusConverterBO.toRankine(tempToConvert);

        //then
        assertEquals(ConstantsForTests.RANKINE, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromCelsiusToReaumur() {
        //given
        CelsiusConverterBO celsiusConverterBO = new CelsiusConverterBO();
        double tempToConvert = ConstantsForTests.CELSIUS;
        double convertedTemp = 0.0;

        //when
        convertedTemp = celsiusConverterBO.toReaumur(tempToConvert);
        //then
        assertEquals(ConstantsForTests.REAUMUR, convertedTemp, ConstantsForTests.DELTA);
    }

}
