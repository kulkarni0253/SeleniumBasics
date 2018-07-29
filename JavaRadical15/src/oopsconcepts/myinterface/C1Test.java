package oopsconcepts.myinterface;

public class C1Test {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		
		obj.m1();
		obj.m2();
		obj.m3();
		
		//we can have reference of parent interface to access child class
		
		I1 obj1 = new C1();
		obj1.m1();
		
		}

}
