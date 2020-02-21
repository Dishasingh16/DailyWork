package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> map =new HashMap<>();
		map.put("banana",35);
		map.put("berry",45);
		map.put("kiwi",55);
		map.put("grapes",65);
	
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
	}
}
