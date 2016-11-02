/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rpolak.temperatureconverter.fahrenheit.bo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.temperatureconverter.util.ConstantsForTests;

/**
 *
 * @author Rafal.Polak
 */
public class FahrenheitConverterBOTest {

    public FahrenheitConverterBOTest() {
    }

    @Test
    public void shouldConvertFromFahrenheitToCelsius() {
        //given
        FahrenheitConverterBO fahrenheitConverterBO = new FahrenheitConverterBO();
        double tempToConvert = ConstantsForTests.FAHRENHEIT;
        double convertedTemp = 0.0;

        //when
        convertedTemp = fahrenheitConverterBO.toCelsius(tempToConvert);

        //then
        assertEquals(ConstantsForTests.CELSIUS, convertedTemp, ConstantsForTests.DELTA);

    }

    @Test
    public void shouldConvertFromFahrenheitToKelvin() {
        //given
        FahrenheitConverterBO fahrenheitConverterBO = new FahrenheitConverterBO();
        double tempToConvert = ConstantsForTests.FAHRENHEIT;
        double convertedTemp = 0.0;

        //when
        convertedTemp = fahrenheitConverterBO.toKelvin(tempToConvert);

        //then
        assertEquals(ConstantsForTests.KELVIN, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromFahrenheitToRankine() {
        //given
        FahrenheitConverterBO fahrenheitConverterBO = new FahrenheitConverterBO();
        double tempToConvert = ConstantsForTests.FAHRENHEIT;
        double convertedTemp = 0.0;

        //when
        convertedTemp = fahrenheitConverterBO.toRankine(tempToConvert);

        //then
        assertEquals(ConstantsForTests.RANKINE, convertedTemp, ConstantsForTests.DELTA);
    }

    @Test
    public void shouldConvertFromFahrenheitToReaumur() {
        //given
        FahrenheitConverterBO fahrenheitConverterBO = new FahrenheitConverterBO();
        double tempToConvert = ConstantsForTests.FAHRENHEIT;
        double convertedTemp = 0.0;

        //when
        convertedTemp = fahrenheitConverterBO.toReaumur(tempToConvert);

        //then
        assertEquals(ConstantsForTests.REAUMUR, convertedTemp, ConstantsForTests.DELTA);
    }
}
