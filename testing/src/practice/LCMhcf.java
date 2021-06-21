package practice;

public class LCMhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=12;
	int b=24;
	int h=0;
	int l=0;
	int d=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0 && b%i==0)
		{
			h=i;
		}
	}
	System.out.println(h);
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if(a*i==b*j&& d==0)
			{
				l=a*i;
				d++;
			}
		}
	}
		System.out.println(l);
	}

}
