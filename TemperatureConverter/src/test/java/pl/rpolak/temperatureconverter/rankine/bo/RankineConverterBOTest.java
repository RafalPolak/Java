package pl.rpolak.temperatureconverter.rankine.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.temperatureconverter.util.ConstantsForTests;

/**
 *
 * @author Rafal.Polak
 */
public class RankineConverterBOTest {

    public RankineConverterBOTest() {
    }

    @Test
    public void shouldConvertFromRankineToCelsius() {
        //given
        RankineConverterBO rankineConverterBO = new RankineConverterBO();
        double tempToConvert = ConstantsForTests.RANKINE;
        double convertedTemp = 0.0;

        //when
        convertedTemp = rankineConverterBO.toCelsius(tempToConvert);

        //then
        assertEquals(ConstantsForTests.CELSIUS, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromRankineToFahrenheit() {
        //given
        RankineConverterBO rankineConverterBO = new RankineConverterBO();
        double tempToConvert = ConstantsForTests.RANKINE;
        double convertedTemp = 0.0;

        //when
        convertedTemp = rankineConverterBO.toFahrenheit(tempToConvert);

        //then
        assertEquals(ConstantsForTests.FAHRENHEIT, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromRankineToKelvin() {
        //given
        RankineConverterBO rankineConverterBO = new RankineConverterBO();
        double tempToConvert = ConstantsForTests.RANKINE;
        double convertedTemp = 0.0;

        //when
        convertedTemp = rankineConverterBO.toKelvin(tempToConvert);

        //then
        assertEquals(ConstantsForTests.KELVIN, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromRankineToReaumur() {
        //given
        RankineConverterBO rankineConverterBO = new RankineConverterBO();
        double tempToConvert = ConstantsForTests.RANKINE;
        double convertedTemp = 0.0;

        //when
        convertedTemp = rankineConverterBO.toReaumur(tempToConvert);

        //then
        assertEquals(ConstantsForTests.REAUMUR, convertedTemp, ConstantsForTests.DELTA);
    }

}
