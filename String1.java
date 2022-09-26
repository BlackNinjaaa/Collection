package core2java;

public class String1 {

	public static void main(String[] args) {
		
		String1 be=new String1(1,"sri");
		
				
		
////		String1 s1=new String1();
////		s1.main();
////		
////		
////		String1 se=new String1();
////		    //se.main();
////		    
////		String1 se2=new String1();
////		
////		System.out.println(se);
////		System.out.println(se2);
//		
//		System.out.println(se==se2);
//		System.out.println(se.equals(se2));
       
	}
	
	
       int num;
       String name;
	// constructor
			String1(int num, String name) 
					
			{this.num=num;
			this.name=name;
				
			}
			

	void main()
	
	{   
	    
		String a="riya";
		String b="riya";
		
		//System.out.println(a);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
	}

	@Override
	public String toString() {
		return num+" "+name;
	}
	
	
	
}
