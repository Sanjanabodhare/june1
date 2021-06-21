package practice;

import java.util.Scanner;

public class Palidromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b="abba";
		int c=b.length();
		String h="";
		
		for(int i=c-1;i>=0;i--)
		{
			h=h+b.charAt(i);
		}
		System.out.println(h);
		if(b.equals(h))
		{
			System.out.println("yes palidrome");
		}
		else
		{
			System.out.println("Not a palideome");
		}
		
	}

}
