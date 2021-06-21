package main;

public class tryandcatch {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,9};
		int n=a.length;
		int b=0;
		int d=0;
				
		try
		{
			for(int i=0;i<=n;i++)
			{
				//d=a[0]%b;
				System.out.println(a[i]);
			}
		}
		
		catch(ArithmeticException e)
		{
			try {
			System.out.println("ArithmeticException");
			}
			catch(ArithmeticException y)
			{
				
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		finally
		{
			System.out.println("finally");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
