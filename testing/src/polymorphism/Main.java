package polymorphism;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 x=new Class2();
		x.test();
		x.test1();
		x.demo();
		x.PQR();
	int a=10;
	long b=a;
	double c=a;
	float d=a;
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	double f=280.23;
	long g=(long)f;	
	System.out.println(g);
	int h=(int)f;
	System.out.println(h);
	long s=80252;
	short z=(short)s;
	System.out.println(z);
	
	}

}
