package package1;

public class class2 implements interface1 {
	
	public void test() {
		System.out.println("implement test");
	}
	public void demo() {
		System.out.println("implement demo");
	}
	
	public void abc() {
		System.out.println("override abc");
	}
		
	public static void main(String[] args) {
		class2 q=new class2();
		q.abc();
		q.demo();
		q.test();
		interface1.pqr();
		System.out.println(interface1.a);	
	
	}
	
}

