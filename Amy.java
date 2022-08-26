package corejava;

public class Amy {

	public static void main(String[] args) {
          Amy Obj=new Amy();
          Obj.main();// TODO Auto-generated method stub

	}


 void main() {
        int b=153;
        int  amy=0,sum=0;
        int a=b;
        while (a>0)
        {
        	sum=a%10;
        	a=a/10;
        	amy=(sum*sum*sum)+amy;
        			
        }
        System.out.println(amy);
        if(b==amy)
        	{
        	  System.out.println("this number is amstrong");
        	}
        else
        {
        	System.out.println("this is not a amstrong");
        }
 
        }

	 
}