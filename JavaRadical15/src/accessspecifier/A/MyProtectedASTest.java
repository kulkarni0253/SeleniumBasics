package accessspecifier.A;

public class MyProtectedASTest extends MyProtectedAS  {
	
	public static void main(String args[]){
		
		MyProtectedAS obj = new MyProtectedAS();
		obj.test2();
		// yellow rhombus = protected class = accessible within package only
		obj.test1();
		obj.test2();
	}

}
 