import java.util.Scanner;

public class AverageOfThreeNumbers{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	//Take input of First number
	System.out.print("Enter the First number: ");
	double firstNumber=input.nextDouble();

	//Take input of Second number
	System.out.print("Enter the Second number: ");
	double secondNumber=input.nextDouble();
	
	//Take input of Third number
	System.out.print("Enter the Third number: ");
	double thirdNumber=input.nextDouble();

	//Calculate the answer
	double result= (firstNumber + secondNumber + thirdNumber)/3;

	//Show the result
	System.out.print("average of three numbers is: " + result);
}
} 
