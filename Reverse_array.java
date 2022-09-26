package core2java;

public class Reverse_array {

	public static void main(String[] args) {
		Reverse_array me = new Reverse_array();
		     me.main();// TODO Auto-generated method stub

	}
	char alpha[]= {'A','B','C','D','Z'};
	void main() {
	for(int i=0;i<alpha.length;i++)
	{
		int a = alpha[i];
		a=a+1;
		if(a>90)
		{
		  a=a-26;
		  char c= (char) a;
		  alpha[i]=c;
		 
		}
		
	}
	for(int i=0;i<alpha.length;i++)
	{
	System.out.println(alpha[i]);
}
	}
}