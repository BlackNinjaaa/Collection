package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class execp1 {
 
Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		execp1 me=new execp1();
		me.person();
		

	}
	
	public void person()
	{
		
		
		try 
		{
			System.out.println("Enter the first value:");
			int age= sc.nextInt();
			System.out.println("Enter the second value:");
			int age2=sc.nextInt();
			int div=age/age2;
		//System.out.println(div);
		}
	
		catch(ArithmeticException b)
		{
				System.out.println("divided by zero not work");
				
		}
		catch(InputMismatchException b)
		{
			System.out.println("Enter number's only");
		}
		
		
		
		
	}
	
	public void aadhar()
	{
		
		
	}
	

}
