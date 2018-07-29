package basic;

public class MyBasicsOfMethodsTest {
	
	public static void main(String args[]){
		
		MyBasicsOfMethods obj = new MyBasicsOfMethods();
		
		boolean result = obj.test1(10,"Harshal");
		System.out.println("Result of user creation : "+ result);
	
		
		int result1 = obj.test3(20, true);
		System.out.println("Result of test1 : "+ result1);
		
		MyBasicsOfMethods obj1 = new MyBasicsOfMethods();
		obj.test2();
		
		 
	}

}
