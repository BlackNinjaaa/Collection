package core2java;

public class Sort {

	public static void main(String[] args) {
		Sort me=new Sort();
		//me.find();// TODO Auto-generated method stub
        me.bubble();
	}
	
	void find()
	{
		int a[]= {7,5,1,4,6,3,8,16};
	
	int max=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		
	}System.out.println(max);
		
	
}
	void bubble() { // Bubble sort
		
		int a []= {7,5,1,4,6,3,8,16};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) // why i+1 because of next index
			{ 
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
	
System.out.println(a[i]);}
		
	}
}
