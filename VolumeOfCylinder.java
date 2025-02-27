import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args){
		
	    Scanner input=new Scanner(System.in);
	    
            //Take input of Radius from user
	    System.out.print("Enter the Radius of Cylinder: ");
	    double radius=input.nextDouble();

	    //Take input of height from user
            System.out.print("Enter the height of Cylinder: ");
            double height=input.nextDouble();

	    //Calculate Volume using the formula
	    double volume= Math.PI * Math.pow(radius,2) * height;
	    
   	    System.out.print("Volume of Cylinder is: " + volume);
}
}
