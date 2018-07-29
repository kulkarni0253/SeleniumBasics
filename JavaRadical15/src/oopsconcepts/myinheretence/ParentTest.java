package oopsconcepts.myinheretence;

public class ParentTest {
	
	public static void main(String[] args){
		
		Parent obj = new Parent();
		obj.method1();
		
		Child obj1 = new Child();
		obj1.method2();
		
		GrandChild obj2 = new GrandChild();
		obj2.method6();
		obj2.method1();
	
	}

}
