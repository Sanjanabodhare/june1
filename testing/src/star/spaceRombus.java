package star;

public class spaceRombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=1;a<6;a++)
		{
			for(int c=5;c>a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=5;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
