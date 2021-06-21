package practice;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int b=4;
	int d=0;
	
	for(int i=2;i<b;i++)
	{
		if(b%i==0)
		{
			d++;
		}
	}
	if(d==0)
	{
		System.out.println("Prime No");
	}
	else
	{
		System.out.println("not Prime No");
	}
		
		
		
	}

}