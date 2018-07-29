package mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
	
	//duplicate elements allowed
	//

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("Anil");
		myList.add("Sunil");
		myList.add("Harshal");
		myList.add("Mayur");
		
		for (String name : myList) {
			System.out.println("==== "+name);			
		}
		
		
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//index base access allowed
		
		System.out.println("single element = "+myList.get(2));
		myList.remove("Mayur");
		
		Iterator<String> itr1 = myList.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
