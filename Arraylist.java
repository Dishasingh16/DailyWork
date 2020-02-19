package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("7");
		list.add("true");
		ListIterator<String> it = list.listIterator();
		System.out.println("****fwd only****");
		while(it.hasNext()) {
			String element =it.next();
			System.out.println(element);
			
		}
		System.out.println("****back only****");
		while(it.hasPrevious()) {
			String element =it.previous();
			System.out.println(element);
		}
		
		/*System.out.println(list);
		list.remove(2);
		list.add(2, "world");
		for(String obj : list) {
			System.out.println(obj);*/
				
			
		}
		
		
	}

