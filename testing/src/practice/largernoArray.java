package practice;

public class largernoArray {

	public static void main(String[] args) {
		
		int []b= {88,25,95,233,48};
		int c= b.length;
		int d=0;
		//System.out.println(c);
		
	
			for(int i=1;i<c;i++)
			{
				if(b[d]<b[i])
				{
					b[d]=b[i];
				}
			}
		System.out.println(b[d]);	
		
	}

}
