package abc;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []b= {15,5,35,4,5,25,15};
		int size=b.length;
		System.out.println("size of array is" +size);	
		int x=0;
		int c=0;
		
		for(int i=0; i<size;i++)
		{
		 c=0;
			for(int j=i; j<size;j++)
				
			{
				if(b[i]==b[j])
				{
					c++;		
				}							
			}		
			
		}
		System.out.println(c);
	
	}

}
