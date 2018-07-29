package oopsconcepts.myconstructor;

public class MyConstructor {
	
	int i;
	String s;
	
	MyConstructor(int value){
		System.out.println("in constructor int");
		i = value;
	}
	
	MyConstructor(int value, String name){
		System.out.println("in constructor int string");
		i = value;
		s = name;
	}
	
	MyConstructor(int value, String name, int k){
		System.out.println("in constructor");
		i = value;
		s = name;
		k = 40; 
	}
	
	
	
	
	

}
