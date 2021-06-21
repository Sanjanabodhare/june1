package practice;

public class duplicatestring {

	
	public static void main(String[] args) {
		
	String b[]= {"for","to","hey","to","hello","to","for","to"};
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
