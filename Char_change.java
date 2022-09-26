package core2java;
import java.util.Scanner;

public class Char_change {
 Scanner sc=new Scanner(System.in); // scanner class
	public static void main(String[] args) {
		Char_change gen = new Char_change();// TODO Auto-generated method stub
                //gen.main();
                //gen.beta();
		         //gen.numeric();
	           // gen.gama();
		      //gen.delta();
		gen.common();
	}

	void main()
	{
		char gender[]= {'M','F','T'};
		
		//before casting 
		for(int i=0;i<gender.length;i++) {
		System.out.println(gender[i]);
		}
		
		//after casting 
		for(int i=0;i<gender.length;i++)
		{
			int a = gender[i];
			a=a+32;
			char c= (char) a;
			gender[i]=c;
			System.out.println(c);
		} 
	}
	// shift 2 times
	public void beta() {
		 
		char alpha[]= {'A','B','C','D','E'};
		
		for(int i=0;i<alpha.length;i++)
		{
		   int a=alpha[i];
		   a=a+2;
		   char c= (char)a;
		   alpha[i]=c;
		   System.out.print(c+" ");
		}
		
	}	

// shift one time
	public void numeric() {
		char number[]= {'1','2','3','4','5'};
		for(int i=0;i<number.length;i++) {
			
			int a = number[i];
			a=a+1;
			char c=(char)a;
			number[i]=c;
			System.out.print(c+" ");
		}
		
	}
// odd even shift
	public void gama() {
		char dec[]= {'K','L','M','N','O'};
		for (int i=0;i<dec.length;i++)
		{int a= dec[i];
		
			if(i%2==0)
			{
				a=a+2;
				dec[i]=(char)a;
			}
			else
			{
				a=a+1;
				dec[i]=(char)a;
			}
			System.out.print(dec[i]+" ");
		}
		
	}
	public void delta()
	{
	  char list[] = {'A','B','C','D','E','Z'};
	   char temp = list[0];
   for(int i=0;i<list.length-1;i++)
   {
	  list[i]=list[i+1];
	  
   }
   list[5]=temp;
   	for(int i=0;i<list.length;i++) {
   		System.out.print(list[i]+" ");
   	}
     
   
}
	// common values store to next array
	public void common(){
		int a[]=new int [5];
		int b[]=new int [5];
		System.out.print("Enter the values:");
		for(int i=0;i<a.length;i++)
		{  
            a[i]=sc.nextInt();
		}
		

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
		// b array 
		System.out.print("Enter the values:");
		for(int i=0;i<b.length;i++)
		{  
            b[i]=sc.nextInt();
		}
		

		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=0;j<b.length;j++)
	    		   
	    	   {
	    		   for(int k=0;k<a.length;k++)
	    		   {
	    		   if(a[i]==b[j])
	    		   {
	    			   
	    		   }
	    	   }
	       }
	       }	
	
	
	}
	
	
	
	
	
}


	

