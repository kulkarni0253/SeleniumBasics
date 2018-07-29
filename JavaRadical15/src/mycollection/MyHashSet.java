package mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {

		//unique elements only
		//hashset : insertion order not maintained
		//Treeset : asc order printed
		
		Set<String> mySet = new HashSet<String>();
		mySet.add("Vishu");
		mySet.add("sonu");
		mySet.add("bandya");
		mySet.add("Pintya");
		mySet.add("monya");
		mySet.add("Vishu");
		
		for (String name : mySet) {
			System.out.println("==== "+name);			
		}
		
		Iterator<String> itr = mySet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
