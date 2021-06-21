package abc;

import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int n= s.nextInt();
			
			int a=n;
			int c=1;
			int x=n;
			int h=0;
			
			for(int i=1; i<=10; i++)
			{
				 a=a/10;
				if(a!=0)
					
				{
					c++;
				}
				//System.out.println(a);
			}
		
			for(int j=1; j<=c;j++)
			{
				int z=x%10;
				 h=h*10+z;
				x=x/10;
			
			}
			System.out.println(h);
			if(n==h)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
			
			
			
	}
}
