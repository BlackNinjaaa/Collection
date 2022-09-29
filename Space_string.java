package core2java;

public class Space_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Space_string me=new Space_string();
        // me.space();
         me.hard();
		
	}
	
	public void space() {
	String s1="This is our World";
	
	String s2;
	s2=s1.replaceAll(" ","");
	System.out.println(s2);

}
	
	public void hard()
	{
		String s="a2v3b1c2g100";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<s.charAt(i+1)-48;j++)
				{
					System.out.println(s.charAt(i));
				}
			}
		}
	}
}
