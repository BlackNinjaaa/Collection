package core2java;
public class SumArray {

	public static void main(String[] args) {
		
	
	SumArray s1= new SumArray();
	     s1.main();
	}
	
	void main() {
	int std[] = new int[6];
	int a=0;
	int b=0;
	 std[0]=10;
	 std[1]=12;
	 std[2]=11;
	 std[3]=11;
	 std[4]=9;
	 std[5]=8;
	  for(int i=0;i<std.length;i++) {

	  if(std[i]%2==0)
	  {
	     a=a+std[i];
	    // System.out.println("The even numbers are:"+ a);  
	     }
	  
	  else
	  {
		b =b+std[i]; // add b to find sum of all digits 
	
	//System.out.println("The odd numbers are:" + b);
		
		}
	  
		 }
	  System.out.println((a+b)/6);
}
	 	
	
}
