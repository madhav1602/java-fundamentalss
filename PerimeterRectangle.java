import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        //Take length input from user
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        //Take width input from user 
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        //Calculate the perimeter using the formula
        double perimeter = 2 * (length + width);

        //Show the calculated perimeter
        System.out.println("Perimeter of the rectangle: " + perimeter);

        
}
}
