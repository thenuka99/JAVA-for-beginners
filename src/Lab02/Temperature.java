//----- Lab02 -----
// Q01

package Lab02;

public class Temperature {

    public static void main(String[] args) {
        double fahrenheit = 212;
        double celsius = 98.5;

        System.out.println("Fahrenheit value before converting to celsius: " + fahrenheit);
        System.out.println("Fahrenheit value after converting to celsius: " + (fahrenheit - 32) / 9 * 5);
        System.out.println("Celsius value before converting to fahrenheit: " + celsius);
        System.out.println("Celsius value after converting to fahrenheit: " + (celsius) / 5 * 9 + 32);

    }
}
