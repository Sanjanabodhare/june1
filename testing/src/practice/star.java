package practice;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int d=1;
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(d);
				d++;
			}
			System.out.println();
		}*/
		
		for(int a=1;a<=6;a++)
		{
			for(int c=5;c>=a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a*2-1;b++)
			{
				if(a%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(b+"");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
