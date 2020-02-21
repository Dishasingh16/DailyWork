package test;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> map =new TreeMap<>();
		map.put("banana","a");
		map.put("berry","b");
		map.put("kiwi","c");
		map.put("grapes","d");
	
		for(Entry<String, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
	}
}