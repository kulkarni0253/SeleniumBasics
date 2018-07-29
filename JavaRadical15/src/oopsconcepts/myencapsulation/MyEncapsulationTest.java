package oopsconcepts.myencapsulation;

public class MyEncapsulationTest {
	
	public static void main(String[] args){
		
		MyEncapsulation obj = new MyEncapsulation();
		obj.setEmpID(10);
		obj.setEmpName("Harshal");
		
		MyEncapsulationUserLib user = new MyEncapsulationUserLib();
		user.createUser(obj);
	}

}
