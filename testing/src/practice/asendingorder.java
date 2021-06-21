package practice;

import java.util.Scanner;

public class asendingorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {12,2,15,16,7,44,85};
		int c=b.length;
		int x=0;
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(b[i]<b[j])
				{
					x=b[i];
					b[i]=b[j];
					b[j]=x;
				}
			}
		}
		for(int i=0;i<c;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
