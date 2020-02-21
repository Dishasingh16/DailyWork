package test;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class linkedhashmap {
	
	

		public static void main(String[] args) {
			LinkedHashMap<String,Integer> map =new LinkedHashMap<>();
			map.put("banana",35);
			map.put("berry",45);
			map.put("kiwi",55);
			map.put("grapes",65);
		
			for(Entry<String, Integer> entry : map.entrySet()) {
				
				System.out.println(entry.getKey()+"---->"+entry.getValue());
				
			}
		}
	}

