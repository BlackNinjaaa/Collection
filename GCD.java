package corejava;

public class GCD {

	public static void main(String[] args) {
		GCD Obj=new GCD();
		Obj.Digits();// TODO Auto-generated method stub
        Obj.Digits1();
	}



void Digits(){
	int first=9,second=15,GCD=0;
	int small=(first>second)? first:second;
	for(int i=2;i<=small;i++)
	{
		
		if(first%i==0 && second%i==0) {
			GCD=i;
		}
	}
	System.out.println(GCD);
	
}


void Digits1() {
	int first=3,second=7,LCM=0;
	int larger=(first>second)?first:second;
	int smaller=(second>first)?second:first;
	int i=larger;
if(larger%smaller==0)
{
	LCM=larger;
     System.out.println(LCM);	
}

}
}