import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Take the base input from user
        System.out.print("Enter the base: ");
        int base =input.nextInt();

        //Take the exponent input from user
        System.out.print("Enter the exponent: ");
        int exponent =input.nextInt();

        //Calculate power 
        double answer = Math.pow(base, exponent);

        //Show the result
        System.out.println("answer: "+answer);

        
}
}
