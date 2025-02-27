import java.util.Scanner;

public class KilometersToMiles{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take input of distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = input.nextDouble();

        //Convert kilometers to miles 
        double miles = kilometers*0.621371;

        //Show the result
        System.out.println("Result: "+ miles);

      
}
}
