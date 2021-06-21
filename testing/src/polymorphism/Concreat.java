package polymorphism;

public class Concreat extends test{

	void test1(){
		System.out.println("concreat");
	}
	public void pqr() {
		System.out.println("concreat2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concreat q=new Concreat();
		q.demo();
		q.pqr();
		q.test1();
		
	}

}
