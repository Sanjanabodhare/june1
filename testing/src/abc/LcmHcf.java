package abc;

public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a=48;
			int b=32;
			int d=0;
			int h=0;
			int l=0;
			
			for(int i=1; i<=a;i++)
			{
				if(a%i==0 && b%i==0)
				{
					h=i;
				}
			}
			System.out.println(h+" is hcf");
			
			for(int p=1; p<=10;p++)
			{
				for(int q=1; q<=10; q++)
				{
					if(a*p==b*q&& d==0)
					{
						l=a*p;
						d=d+1;
					}
				}
			}
			System.out.println(l+" is lcm");
	}

}
