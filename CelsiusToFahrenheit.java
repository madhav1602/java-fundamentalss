import java.util.Scanner;

public class CelsiusToFahrenheit{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Take input of the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        //Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        //Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        
}
}
