package star;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<5;a++)
		{
			for(int c=4;c>a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a*2-1;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=3;a>=1;a--)
		{
			for(int c=3;c>=a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a*2-1;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
