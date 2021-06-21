package practice;

import java.util.Scanner;

public class scannerstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Char");
		String n=s.next();
		int d=n.length();
		char b[]=new char[d];
		String k="";
		
		for(int i=d-1;i>=0;i--)
		{
			b[i]=n.charAt(i);
			k=k+b[i];
		}
		System.out.println(k);
		
	}

}
