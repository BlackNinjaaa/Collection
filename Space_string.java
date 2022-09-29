package core2java;

public class Space_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Space_string me=new Space_string();
        // me.space();
        // me.hard();
		me.select();
	}
	
	public void space() {
	String s1="This is our World";
	
	String s2;
	s2=s1.replaceAll(" ","");
	System.out.println(s2);

}
	
	public void hard()
	{
		String s="a2v3b1c2g";
		for(int i=0;i<=s.length()-1;i++) // this for only exicute in 2
		{
			if(i%2==0) // this for modulus of second index
			{
				for(int j=0;j<s.charAt(i+1)-48;j++) // 48 for the numbers contain ascii value
				{
					System.out.println(s.charAt(i));
				}
			}
		}
	}
	public void select()
	{
		int a[]= {10,34,67,23,45};
		//int max=a[0];
		int temp=0;
	
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
		     if(a[i]>a[j])
		   {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			   
		   }
			}
		
		}
		System.out.println(a[a.length-2]);
	}
}
