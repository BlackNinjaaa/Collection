package core2java;

public class String2 {

	public static void main(String[] args) {
		String2 me = new String2();
		 me.toUppercase();
		// TODO Auto-generated method stub
		
		String2 sc=new String2();
		System.out.println(sc+"\n");
		
		
		 String s1 = "Tutorials Point";
	      String s2 = "Tutorials Point";
	      System.out.println("s1 and s2 are string literals:");
	      
	      System.out.println(s1.hashCode());
	      System.out.println(s2.hashCode());
	      
	      System.out.println(s1 == s2);
	      System.out.println(s1.equals(s2));
	      
	      String s3 = new String("   Tutorials Point   ");
	      String s4 = new String("  Tut  orials Point");
	      System.out.println("s3 and s4 with new operator:");
	      System.out.println(s3 == s4);
	      System.out.println(s3.equals(s4));
	      
	      System.out.println(s3.length()); // show the lenght of the string
	      
	      System.out.println(s1.toLowerCase()); // to lower case
	      System.out.println(s1.toUpperCase()+s2.toLowerCase()); // to upper case
	
	       System.out.println(s3.trim()); //trim the space btw before the value and after the value

	 }

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Gahndhi";
//	}
//	
}
