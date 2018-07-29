package oopsconcepts.myconstructor;

public class MyConstructorTest {

	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor(10);
		int k = obj.i;
		System.out.println("k value -- "+k);
		MyConstructor obj1 = new MyConstructor(20, "Harshal");
		int j = obj1.i;
		System.out.println("j value -- "+j);
		System.out.println("and name -- "+obj1.s);
	}

}
