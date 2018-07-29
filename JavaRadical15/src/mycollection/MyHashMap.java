package mycollection;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		//unique elements
		// first key and second value
		//order not maintained
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(11, "Nashik");
		map.put(22, "Mumbai");
		map.put(33, "Bangalore");
		map.put(44, "Pune");
		map.put(55, "Delhi");
		
		for(HashMap.Entry<Integer, String> m: map.entrySet()){
			System.out.println("Key = "+m.getKey());
			System.out.println("Value = "+m.getValue());
		}

	}

}
