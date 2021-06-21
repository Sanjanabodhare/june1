package practice;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] b= {28,55,67,2,16};
		int c=b.length;
		//System.out.println(c);
		
		int x=0;
		int d=0;
		
		
		System.out.println();
		
		for(int a=0;a<c;a++)
		{
			for(int j=a;j<c;j++)
			{
				if(b[a]>b[j])
				{
					x=b[a];
					b[a]=b[j];
					b[j]=x;
				}
				
			}
			System.out.print(b[a]+",");
		}
	
			
		
		
		
	}

}
