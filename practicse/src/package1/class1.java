package package1;

public class class1 {
	
	static String a ="Velocity";
	
	static String b ="velocity";
	
	static String c = new String ("velocity");
	
	static String d = new String ("velocity");
	
	public static void main(String[] args) {
		
		boolean x=a.equals(c);
		System.out.println(x);
		
		x=a.equalsIgnoreCase(d);
		System.out.println(x);
		
		System.out.println(a.endsWith("ty"));
		System.out.println(a.startsWith("vel"));
		System.out.println(a.indexOf('V'));
		System.out.println(a.lastIndexOf('o'));
		
		System.out.println(a.charAt(5));
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		
		a=a+" Good";
		System.out.println(a);
	b=	b.concat(" Good");
		System.out.println(b.concat(" Good"));
		System.out.println(b);
		
				
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	

}
