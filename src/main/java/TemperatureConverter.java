public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5.0) + 32;

    }
    public static double kelvinToCelsius(double kelvin) {
        return   (kelvin - 273.15) ;

    }

    public static boolean isExtremeTemperature(double celsius) {
        if (celsius < -40 || celsius > 50) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius(fahrenheit) + " °C");
        System.out.println(celsius + " °C = " + celsiusToFahrenheit(celsius) + " °F");
        System.out.println("Is " + celsius + " °C extreme? " + isExtremeTemperature(celsius));

    }
}
