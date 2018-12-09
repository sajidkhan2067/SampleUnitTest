package sajid.com.androidunittestsample;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterUtilTest {

    @Test
    public void convertFahrenheitToCelsius() {
        float actual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float expected = 212;
        assertEquals("Conversion from celsius to fahrenheit failed ",expected,actual,0.001);
    }

    @Test
    public void convertCelsiusToFahrenheit() {
        float actual = ConverterUtil.convertFahrenheitToCelsius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }
}