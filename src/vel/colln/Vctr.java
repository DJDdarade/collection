package vel.colln;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vctr {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		
		
		System.out.println("------ Adding vlu to vector----------------");
		
		System.out.println();
		v.add("abc");
		v.add(25);
		v.add(99);
		v.add(null);
		
		v.add("abc");   //Duplicate valu is acceptable valu
		
		System.out.println(v.indexOf(99));

		System.out.println(v.lastIndexOf("abc"));//4
		System.out.println(v.contains("a"));
		
		System.out.println(v.get(3));
		System.out.println(v);
		v.add(3, "DJD");
		System.out.println(v);
		
		v.set(2, "E");
		
	Iterator trs = v.iterator();

	while(trs.hasNext()) {
	System.out.print(trs.next());
	//System.out.println(trs);
	}
	
	
		Enumeration crs = v.elements();
		
		
		while(crs.hasMoreElements());
		System.out.println();
		}
}
