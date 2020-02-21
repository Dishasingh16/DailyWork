package test;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashtableDemo {
	
			public static void main(String[] args) {
				Hashtable<String,String> map =new Hashtable<>();
				map.put("banana","a");
				map.put("berry","b");
				map.put("kiwi","c");
				map.put("grapes","d");
			
				for(Entry<String, String> entry : map.entrySet()) {
					
					System.out.println(entry.getKey()+"---->"+entry.getValue());
					
				}
			}
		}



