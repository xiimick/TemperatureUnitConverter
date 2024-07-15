package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Temperature unit converter");

        double fahrenheit = 75;
        double convCelsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("\n%.2f fahrenheit is equivalent to %.2f celsius", fahrenheit, convCelsius);
    }


    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}