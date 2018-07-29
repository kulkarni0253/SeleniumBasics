package mycollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		//unique elements only
				//hashset : insertion order not maintained
				//Treeset : asc order printed >> first all capslock then small alphabets..
				
				Set<String> mySet = new TreeSet<String>();
				mySet.add("Vishu");
				mySet.add("Sonu");
				mySet.add("Bandya");
				mySet.add("Pintya");
				mySet.add("Monya");
				mySet.add("Vishu");
				
				for (String name1 : mySet) {
					System.out.println("==== "+name1);			
				}
				
//				Iterator<String> itr = mySet.iterator();
//				while(itr.hasNext()){
//					System.out.println(itr.next());
//				}
				
			}


	

}
