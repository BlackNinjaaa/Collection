package corejava;

public class Sum_of_digits {

	public static void main(String[] args) {
		Sum_of_digits obj = new Sum_of_digits();
		//obj.String();
        obj.String1();
	}

// sum of n numbers
	
	public void String() {
		
		int n=10;
		// String String="Company";
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		}


// divisers of given number
 
public void String1() {
	int n=52;

	for(int i=1;i<=n;i++)
	{
		if(n%i==0) {
			System.out.println(i);}
		}
	}
}




