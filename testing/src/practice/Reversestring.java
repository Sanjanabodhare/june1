package practice;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a=s.next();
		String h="";
		int c=a.length();
		char b[]=new char[c];
		
		for(int i=c-1;i>=0;i--)
		{
			b[i]=a.charAt(i);
			h=h+b[i];
		}
		System.out.println(h);
	}

}
