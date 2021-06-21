package practice;

import java.util.Scanner;

public class Arrayprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	System.out.println("enter value");
	int n=s.nextInt();
	int b[]=new int[n];
	int c=b.length;
	int d=0;
	
	for(int i=0; i<c;i++)
	{
		b[i]=s.nextInt();
	}
		
	for(int j=0;j<c;j++)
	{
		d=0;
		for(int k=2;k<b[j];k++)
		{
			if(b[j]%k==0)
			{
				d++;
			}
		}
		if(d==0)
		{
			System.out.print(b[j]+" ");
		}
	}
	
	}
}
