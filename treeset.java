package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
		
	
public class treeset {
	
			public static void main(String[] args) {
				TreeSet<String> set= new TreeSet<>();
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
			}
	}
