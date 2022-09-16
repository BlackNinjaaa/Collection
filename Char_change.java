package core2java;

public class Char_change {

	public static void main(String[] args) {
		Char_change gen = new Char_change();// TODO Auto-generated method stub
                //gen.main();
                //gen.beta();
		        // gen.numeric();
	            //gen.gama();
		      gen.delta();
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
		   System.out.println(c);
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
			System.out.println(c);
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
			System.out.println(dec[i]);
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
   		System.out.println(list[i]+"");
   	}
     
   
}
	
	
}


	

