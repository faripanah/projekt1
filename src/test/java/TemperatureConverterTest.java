import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void fahrenheitToCelsius() {
            assertEquals(37.0 , TemperatureConverter.fahrenheitToCelsius(98.6), 0.001);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
   public  void celsiusToFahrenheit() {
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.001);
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
    }
    @Test
    public void kelvinToCelsius() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.001);
    }

    @Test
    public void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-45));
        assertTrue(TemperatureConverter.isExtremeTemperature(60));
        assertFalse(TemperatureConverter.isExtremeTemperature(50));
    }

    @Test
    public void main() {
    }
}