package core2java;

public class Reverse_array {

	public static void main(String[] args) {
		Reverse_array me = new Reverse_array();
		     //me.main();// TODO Auto-generated method stub
		     me.Anagaram();
		     //me.anaa();

	}
	
	
	   
	private void Anagaram() {
		String s1="aple";
		String s2="epla";
		 int i=0;
		 int j=0;
		 int k=0;
		 int l=0;
		 char ch[]=s1.toCharArray();
		 char ch1[]=s2.toCharArray();
		 int count=0;
		
		for( i=0;i<ch.length;i++)
		{
			 //ch[i]=s1.charAt(i);
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		for( j=0;j<ch1.length;j++)
		{
    		 //ch1[j]=s2.charAt(j);
			System.out.print(ch1[j]+" ");
		}
		
       if(ch.length==ch1.length)
       {
    	   for( k=0;k<ch.length;k++)
    	   {
    	      for(l=0;l<ch1.length;l++)
    	      {
    	         if(ch[k]==ch1[l])
    	         {
    	        	 count++;
    	          }
               }
           }
    	   System.out.println(count);
    	   
    	   if(count==ch.length)
           {
         	  System.out.println("this is anagram");
         	  
           }
           else
           {
         	  System.out.println("not a anagram");
           }
    	   }
       
       else
       {
    	   System.out.println("This not a anagram");
       }
         
	}
		
	// reverse string 
	     
	public void main() {
		String c="hello";
		String s1="";
	
	for(int i=c.length()-1;i>=0;i--)
	{
		s1=s1+c.charAt(i);
		
		}
	System.out.println(s1);

}


public void anaa()
{
 String a="Tea";
 String b="Eat";
   a=a.toLowerCase() ;
   b=b.toLowerCase();
   
   int ls1[]=new int[a.length()];
   int ls2[]=new int[b.length()];
   
   
   System.out.println(a);
   System.out.println(b);
   int x=0;
   int y=0;
   if(a.length()!=b.length())
   {
	   System.out.println("Not an anagram");
   }
   else
   {
	   for(int i=0;i<a.length();i++)
	   {
		   x=x+a.charAt(i);
		   y=y+b.charAt(i);
	   }
	   
	   for(int i=0;i<a.length()-1;i++)
	   {  int count=1;
		   for(int j=0;j<a.length()-1;j++)
		   {
			   if(a.charAt(i)==a.charAt(j))
			   {
				   count++;
				   ls1[i]=count;
			   }
		   }if(count==1)
			   ls1[i]=count;
	   }
	   for(int i=0;i<b.length();i++)
	   {  int count=1;
		   for(int j=0;j<b.length()-1;j++)
		   {
			   if(b.charAt(i)==b.charAt(j))
			   {
				   count++;
				   ls2[i]=count;
			   }
		   }if(count==1)
			   ls2[i]=count;
	   }
	   
	   
	   
	   
	   if(x==y)
	   {
		   System.out.println("It is anagram");
	   }
	   else
	   {
		   System.out.println("Not a anagram");
	   }
   }
   
}




}
