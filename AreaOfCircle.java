import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Take input for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //Calculate the area 
        double area = Math.PI * Math.pow(radius, 2);

        //Show the result
        System.out.println("Area of the circle: " + area);

        
}
}
