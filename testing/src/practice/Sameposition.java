package practice;

public class Sameposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="sanjana is good girl";
		int c=a.length();
		int z=0;
		int pointer=0;
		String h="";
		
	for(int i=0;i<=c-1;i++)
	{	
		 if(a.charAt(i)!=' ')
		 {
			 pointer++;
		 }
		if(a.charAt(i)==' '||i==c-1)
		{
			for(int j=pointer-1;j>=z;pointer--)
			{
				h=h+a.charAt(j);
			}
			h=h.concat(" ")	;
			pointer++;
			z=pointer;	
		}
	}
	System.out.print(h);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
