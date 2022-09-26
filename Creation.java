package core2java;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Creation me = new Creation();
         //me.toUppercase();
         me.toLowercase();
	}

	public void toUppercase()
	{   
		String s="welcome";
		
		//System.out.println(s.toUpperCase());
		
		char ch[]=new char[s.length()]; // allocate the length of array
		
		for(int i=0;i<ch.length;i++)
		{
		   ch[i]=s.charAt(i); //convert String to character
		   
		System.out.println(ch[i]); // print the character
		
		int a=ch[i];// character convert the integer
		
		a=a-32;// to this change the integer size
		
		char c=(char)a; //covert integer to character
		
		ch[i]=c; 
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		String a=new String (ch);
		
		System.out.println(a);
	}
	
	/////////////////////////////////////////////////
	
	public void toLowercase()
	{
		String a="WELCOME";
		
	char ch1[]=new char[a.length()];
	
	for(int i=0;i<ch1.length;i++)
	{
		 ch1[i]=a.charAt(i);
		 //System.out.println(ch1[i]);
	} 
	for(int i=0;i<ch1.length;i++) {
		
		int b=ch1[i];
		
		 b=b+32;
		 
		 char c=(char)b;
		 
		 ch1[i]=c;
	}
//	 for(int i=0;i<ch1.length;i++)
//	 {
//		 System.out.println(ch1[i]);		 
//		 	
//	}
	 String b= new String (ch1);
	 System.out.println(b);
	}
	

}
