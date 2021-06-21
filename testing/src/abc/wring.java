package abc;

public class wring {

	static String a  ="Sanjana";
	static String b ="Sanjana";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(a.charAt(3));//show the charcter at which index present
		System.out.println(a.equals(b));//Compare two String it is Case Senstive 
		System.out.println(a.equalsIgnoreCase(b));//Compare two String which is not Case Senstive
		System.out.println(a.concat("Smita"));//it use to join Charcters
		System.out.println(a.endsWith("e"));//Compare what is last Char  
		System.out.println(a.startsWith("a"));//chaeck starting letter
		System.out.println(a.indexOf("j"));//it wiil show you at which index char is present
		System.out.println(a.toUpperCase());//it will convert to upper Alphate 
		System.out.println(a.toLowerCase());//it will convert to lower case
		System.out.println(a.replace("S", "G"));//replace old letter to new
		System.out.println(a.replace(a, b));
		System.out.println(a.trim());//remove start and end space
		System.out.println(a.substring(3));//it will startfrom index3
		System.out.println(a.substring(2, 6));
		System.out.println(a.lastIndexOf("n"));
		System.out.println(a.length());
	}

}
