package vel.colln;

import java.util.LinkedList;

public class Linked_list22 {

	public static void main(String[] args) {
		
		LinkedList al=new LinkedList();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println("-----------Add somiting in That-----------------------");
		al.add(null);
		al.add(44);
		al.add(22);
		al.addFirst(10);
		al.add(100);
		al.add(99);
		

		al.add(null);
	//	al.set(0, 55);
		
		
		System.out.println(al);
		System.out.println(al.indexOf(null));
		al.removeFirst();
		System.out.println(al);
		System.out.println(al.indexOf(44));
		
		al.set(0, 55);
		System.out.println("-------After addn somthing------------");
		
		System.out.println(al.isEmpty());
		
		 Object trs = al.element();

		 
	}
}
