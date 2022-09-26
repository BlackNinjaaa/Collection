package core2java;
import java.util.Scanner;

public class Matrix {
	
	Scanner sc=new Scanner(System.in); //beacuse of global level access
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
        Matrix me=new Matrix();
        me.find();
	} 
	

	void find()
	{  // this for loop for processing ..
		
		int a[][] = new int [3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
       // int transpose[][]=new int[3][3];
		 
        for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<a[row].length;col++)
			  {
				a[row][col]=sc.nextInt(); // scanner input collection
				
			  }
			  
			   
		  }
		  // this loop for print what is am get 
		  for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<a[row].length;col++) // arr[row].length > using 
			  {
				System.out.print(a[row][col]);
			
			  }
			  
			 System.out.println();  
		  }
		  
		  //b second matrix
		  
		  for(int row=0;row<b.length;row++)
		  {
			  for(int col=0;col<b[row].length;col++)
			  {
				b[row][col]=sc.nextInt(); // scanner input collection
				
			  }
			  
			  	  
		  
		  }
		  
		  for(int row=0;row<b.length;row++)
		  {
			  for(int col=0;col<b[row].length;col++) // arr[row].length > using 
			  {
				System.out.print(b[row][col]);
				//b[3][3]=arr[row1][col1];
				
			  }
			  
			System.out.println();  
			
		  }
		  
		  
		  for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<b.length;col++)
			  {
					  
					  c[row][col]=a[row][col]+b[row][col];
				  
			  }
			  System.out.println();
			  
		  }
		  
		  for(int row=0;row<c.length;row++)
		  {
			 for(int col=0;col<c.length;col++)
			 {
				 System.out.print(c[row][col]+" ");
			 }
		  System.out.println();
		  
		  }
		  
	}
	
	
}
