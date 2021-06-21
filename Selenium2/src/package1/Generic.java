package package1;

public class Generic<T, E> {

	public E test(E a){
		System.out.println(a);
		return a;
	}
	public T demo(T j){
		System.out.println(j);
		return j;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic p=new Generic();
		p.demo('p');
		p.demo(3);
		p.demo("velocity");
		p.test('y');
		p.test(5);
		p.test("class");
		p.demo(15.15);
		
	}

}
