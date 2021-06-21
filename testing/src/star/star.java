package star;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=5;a>=1;a--)
		{
			for(int c=5;c>a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				if(b==1||b==a||a==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
