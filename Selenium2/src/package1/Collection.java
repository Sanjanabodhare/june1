package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


public class Collection {

	public static void main(String[] args) {
		
//		ArrayList a= new ArrayList();
//		a.add("velocity");
//		a.add('g');
//		a.add(5);
//		a.add(4.56);
//		
//		int length= a.size();
//		
//		for(int i=0;i<length;i++)
//		{
//			System.out.println(a.get(i));
//		}
//		
//		ArrayList <String>ar= new ArrayList<String>();
//		ar.add("velocity");
//		ar.add("g");
//		ar.add("5");
//		ar.add("4.56");
//		
//		for(int i=0;i<length;i++)
//		{
//			System.out.println(ar.get(i));
//		}
		
//		HashSet<String> HasSet= new HashSet<String>();
//		HasSet.add("Velocity");
//		HasSet.add("class");
//		HasSet.add("Feb");
//		HasSet.add("A is");
//		HasSet.add("Good");
//		
//		Iterator <String>i=HasSet.iterator();
//	
//		for(String s:HasSet)
//		{
//			System.out.println(i.next());
//		}
//		i=HasSet.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "velocit");
		hashmap.put(2, "class");
		hashmap.put(3, "Batch");
		hashmap.put(5, null);
		hashmap.put(null, null);
		
		for(Map.Entry<Integer, String>e:hashmap.entrySet() )
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		Hashtable<Integer,String>hashtable=new Hashtable<Integer,String>();
		hashtable.put(1, "velocit");
		hashtable.put(2, "class");
		hashtable.put(3, "Batch");
		hashtable.put(5, "");
		
		
		for(Map.Entry<Integer, String>e:hashmap.entrySet() )
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}	
}
