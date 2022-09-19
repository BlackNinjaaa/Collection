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
//		int a[][]=new int[3][3];
//		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		//int arr[][] = {{7,9,3} ,{1,4,3},{8,6,5}};
		int a[][] = new int [3][3];
        int b[][]=new int[3][3];
		  for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<a[row].length;col++)
			  {
				a[row][col]=sc.nextInt(); // scanner input collection
				
			  }
			  
			  //System.out.println();  
		  }
		  // this loop for print what is am get 
		  for(int row=0;row<a.length;row++)
		  {
			  for(int col=0;col<a[row].length;col++) // arr[row].length > using 
			  {
				System.out.print(a[row][col]);
				//
			  }
			  
			 System.out.println();  
		  }
		  
		  //second matrix
		  
		  for(int row=0;row<b.length;row++)
		  {
			  for(int col=0;col<b[row].length;col++)
			  {
				b[row][col]=sc.nextInt(); // scanner input collection
				
			  }
			  
			  //System.out.println();  
			  	  
		  
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
			  for(int col=0;col<b[row].length;col++)
			  {
				  for(int i=0;col<a.length;i++)
				  {
					  c[row][col]=a[row][col]+b[row][col];
				  }
			  }
		  }
		  
		  for(int row=0;row<c.length;row++)
		  {
			 for(int col=0;col<c.length;col++)
			 {
				 System.out.println(c[row][col]);
			 }
		  }
		  
		//  c[3][3] = a[3][3] +b[3][3];
		//System.out.println(c[3][3]);  
		
		  
		  
	}
	
	
}
