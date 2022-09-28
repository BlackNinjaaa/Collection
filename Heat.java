package core2java;
import java.util.Scanner;

public class Heat {
      Scanner sc=new Scanner(System.in);
    		  
	public static void main(String[] args) {
		Heat me=new Heat();
		//me.main();// TODO Auto-generated method stub
       //me.numeric();
        me.table();
	
	}
	public void main()
	{
		System.out.println("Enter the Fahrenheit:");
		double fa=sc.nextInt();
		
		double c=0;
		
		c=(fa-32)*5/9;
		System.out.println("the celsius is :"+c);
	}

	
	public void numeric()
	{   System.out.println("Enter the Numberic value:");
		int n =sc.nextInt();

	float cel=(n-32)*5/9;  //celsius formula = (f-32)*5/9
    float far=((9/n)/5)+32; // fahrenheit formula=((9*c)/5)+32
	
    System.out.println("The celsius is:"+cel);
    System.out.println("The Fahrenheit is:"+far);
    
    float c=(far-32)*5/9;
    System.out.println("the celsius is:"+c);
//    
	}
	
	public void table()
	{
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		//float cel=0;
		//float far=-4;
		for(int i=0;i<=6;i++)
		{
			
			float c=(n-32)*5/9;
			System.out.println(c);
			float f=((9/c)/5)+32;
			System.out.println(f);
		}
		
	}
	
	
}
