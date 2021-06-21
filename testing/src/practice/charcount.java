package practice;

public class charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b="SanjanaSanjana";
		int c=b.length();
		int d=0;
		
		for(int i=0;i<c;i++)
		{
			d=0;
			for(int j=0;j<c;j++)
			{
				if(j<i&&b.charAt(i)==b.charAt(j))
				{
					break;
				}
				if(b.charAt(i)==b.charAt(j))
				{
					d++;
				}
			}
			if(d>0)
			{
				System.out.println(b.charAt(i)+"="+d);
			}
		}
		
	}

}
