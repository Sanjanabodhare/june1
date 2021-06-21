package practice;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Value");
	int n=s.nextInt();
	int x=n;
	int y=n;
	int h=0;
	int d=0;
	int c=0;
	for(int i=0;i<=10;i++)
	{
		if(x!=0)
		{
			d++;
		}
		x=x/10;
	}
	for(int i=1;i<=d;i++)
	{
		c=y%10;
		h=h*10+c;
		y=y/10;
	}
	
	if(n==h)
	{
		System.out.println("Yes Palidrome");
	}
	else
	{
		System.out.println("Not a Palidrome");
	}
	}
}
