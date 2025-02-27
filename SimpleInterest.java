import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Take the principal input from user
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        //Take the rate of interest input from user
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        //Take the time period input from user
        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        //Calculate simple interest using the formula
        double simpleInterest =(principal*rate *time)/ 100;

        //Show the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        
}
}
