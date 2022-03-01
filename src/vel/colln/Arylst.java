package vel.colln;

import java.util.ArrayList;

public class Arylst {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println("-----------Add somiting in That-----------------------");
		al.add(null);
		al.add(44);
		al.add(22);
		al.add(100);
		al.add(99);
		al.add(0, 84);
	
		al.add(null);     //if we set the valu index will not change and if we add then index will be changed
		al.set(5, 9999);//
		System.out.println(al);
		System.out.println("-------After addn somthing------------");
		
		System.out.println(al.isEmpty());
		
		
		
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.add(11));
		
		al.iterator();
		
		System.out.println(al.add("abc"));
		
		System.out.println(al.size());
		
		
		
	}
	
}
