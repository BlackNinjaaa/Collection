package core2java;
import java.util.Scanner;

public class Mathematics {

	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a : ");   
    		double a = sc.nextDouble();
            System.out.println("Enter the value of b:");   
		    double b = sc.nextDouble();
	
		    //Ceil checking Returns the smallest double value
		    System.out.println("Returns the smallest double value:"+Math.ceil(a));
		    System.out.println("Returns the smsllest double value:"+Math.ceil(b));	
	
		    //abs 
		    System.out.println("Returns the smsllest double value:"+Math.abs(b));
	
	
	}
    
}
