package core2java;
import java.util.Scanner;

public class Formula {
        Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Formula by=new Formula();
           by.find();
	}
	float si=0;
	void find()
	{
		System.out.println("Enter the Principle amount :");
		float P=sc.nextFloat();
		System.out.println("Enter the rate of Intrest:");
		float R=sc.nextFloat();
		System.out.println("Enter the duration :");
		float T=sc.nextFloat();
		si=(P*R*T)/100 ;
		
		System.out.println("The simple intrest is :"+si);
		
	}

}
