package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
		
	
public class hashhset {

		public static void main(String[] args) {
			HashSet<String> set= new HashSet<>();
			set.add("hi");
			set.add("hello");
			set.add("bye");
			set.add("7");
			set.add("true");
			Iterator<String> it = set.iterator();
			
			while(it.hasNext()) {
				String element =it.next();
				System.out.println(element);
				
			}
			
			
			/*System.out.println(list);
			list.remove(2);
			list.add(2, "world");
			for(String obj : list) {
				System.out.println(obj);*/
					
				
			}
			
			
		}




