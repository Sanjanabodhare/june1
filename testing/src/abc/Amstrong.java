package abc;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.println("enter the no");

		int n = s.nextInt();
		int y=n;
		int x=n;
		int c=1;
		int z=0;
		int e=0;
		int d=1;
		int q=0;
		int w=0;
		for (int a=0;a<=n; a++)
		{
			x=x/10;
			if(x!=0)
			{
				d++;
				
			}
		}
	
		System.out.println(d);	
	
			for(int b=1;b<=d;b++)
			{
				c=y%10;
				w=c;
				y=y/10;
				for(int j=1; j<d;j++)
				{
					w=c*w;
				}
				System.out.println(w);
				
				e=w+e;
			
			}
			
			if(e==n)
			{
				System.out.println("amstrong no");
			}
			else
			{
				System.out.println("not amstrong no");
			}
	
	}

}
