package practice;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[]= {2,3,5,4,8,19};
		int c=b.length;
		int x=0;
		int p=0;
		for(int i=c-1;i>=c/2;i--)
		{
			x=b[p];
			b[p]=b[i];
			b[i]=x;
			p++;
		}
		for(int i=0;i<c;i++)
		{
			System.out.println(b[i]);
		}
	}

}
