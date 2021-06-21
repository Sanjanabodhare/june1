package practice;

public class Sequenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String b="smitabodhare";
	int a=b.length();
	String h="";
	char c[]=new char[a];
	for(int i=0;i<a;i++)
	{
		c[i]=b.charAt(i);
		System.out.print(c[i]+",");
	}
		
		
	}

}
