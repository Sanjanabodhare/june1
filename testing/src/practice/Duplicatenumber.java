package practice;

public class Duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int b[]= {2,5,4,8,18,2,4,2,7,14,7,4,71,2};
		int c=b.length;
		int d=0;
		for(int i=0;i<c;i++)
		{
			d=0;
			for(int j=0;j<c;j++)
			{
				if(j<i&& b[i]==b[j])
				{
					break;
				}
				if(b[i]==b[j])
				{
					d++;
				}
			}
			if(d>1)
			{
				System.out.println(b[i]);
			}
		}
		
			
	}

}
