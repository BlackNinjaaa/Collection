package core2java;
import java.util.Scanner;

public class Spiral {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Spiral me=new Spiral();
		//me.it();// TODO Auto-generated method stub
        // me.low();
         //System.out.println(me);
	}
    void it()
    
    {
    	
    	int Arr[][]=new int[4][4];
    	int value = 1;
    
    	
    	for(int col=0;col<=3;col++)//1
    	{
    		Arr[0][col]=value;
    		value++;
    	}
    	for(int row=1;row<=3;row++) //2
    	{
    		Arr[row][3]=value;
    		value++;
    	}
    	for(int col=2;col>=0;col--) //3
    	{
    		Arr[3][col]=value;
    		value++;
    	}
    	for(int row=2;row>=1;row--)	//4
    	{
    		Arr[row][0]=value;
    		value++;
    	}
    	
    	for(int col=1;col<=2;col++) //5
    	{
    		Arr[1][col]=value;
    		value++;
    	}
    	
    	for(int row=2;row<=2; row++)//6
    	{
    		Arr[row][2]=value;
    		value++;
    	}
    	for(int col=1;col>=1;col--)//7
    	{
    		Arr[2][col]=value;
    		value++;
    	}
    	
    	for(int row=0;row<Arr.length;row++)
    	{
    		for(int col=0;col<Arr.length;col++)
    		{
    	System.out.print(Arr[row][col]+"\t");
    		}
    	System.out.println();
    	}
    	
   }
    
    void low()
    
    {   int n=sc.nextInt();
    
    	int Arr[][]=new int[n][n];
    	int value = 1;
    	int mincol=0;
    	int minrow=0;
    	int maxcol=Arr.length-1;
    	int maxrow=Arr.length-1;
    
    	while(value <= n*n)
    	{    	
    	for(int col=mincol;col<=maxcol;col++)//1
    	{
    		Arr[minrow][col]=value;
    		value++;
    	}
    	for(int row=minrow+1;row<=maxrow;row++) //2
    	{
    		Arr[row][maxcol]=value;
    		value++;
    	}
    	for(int col=maxcol-1;col>=mincol;col--) //3
    	{
    		Arr[maxrow][col]=value;
    		value++;
    	}
    	for(int row=maxrow-1;row>=minrow+1;row--)	//4
    	{
    		Arr[row][mincol]=value;
    		value++;
    	}
    	mincol++;
    	minrow++;
    	maxcol--;
    	maxrow--;
    }
    	for(int i=0;i<Arr.length;i++)
    	{
    		for(int j=0;j<Arr.length;j++)
    		{
    			System.out.print(Arr[i][j]+"\t");
    		}
    	System.out.println();
    	
    	}
    
    }
    
}


