package oopsconcepts.myconstructor;

public class MyDefaultConstructorTest {

	public static void main(String[] args) {
		
		MyDefaultConstructor obj = new MyDefaultConstructor();
		
		System.out.println("Local Value has taken preference : "+ obj.i);
		System.out.println("As no value assigned to String its : "+obj.s);

	}

}
