package com.daehosting.temperatureconversions;

import org.junit.Test;
import java.math.*;

import static org.junit.Assert.*;

/**
 * Created by craigwilson on 10/12/16.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The Celsius to Fahrenheit conversion failed.",
                celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getFahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The Fahrenheit to Celsius conversion failed.",
                fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void getWindChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(25),
                BigDecimal.valueOf(15));
        assertEquals("The wind chill in Celsius conversion failed.",
                windChillInCelsiusResult, BigDecimal.valueOf(18.2075));
    }

    @Test
    public void getWindChillInFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(100),
                BigDecimal.valueOf(17));
        assertEquals("The wind chill in Fahrenheit conversion failed",
                windChillInFahrenheit, BigDecimal.valueOf(93.45727985));
    }

}