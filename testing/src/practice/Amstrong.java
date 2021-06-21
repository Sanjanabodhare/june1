package practice;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		int n=s.nextInt();
		int x=n;
		int y=n;
		int h=1;
		int d=0;
		int e=0;
		int c=0;
		
		for(int i=0; i<10;i++)
		{
			if(x!=0)
			{
				d++;
			}
			x=x/10;
		}
		for(int k=1;k<=d;k++)
		{
			c=y%10;
			h=c;
			for(int j=1;j<d;j++)
			{
				h=h*c;
			}
			y=y/10;
			e=e+h;
		}
		if(n==e)
		{
			System.out.println("Yes Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}

}
