package accessspecifier.B;

import accessspecifier.A.MyProtectedAS;

public class MyProtectedASTest extends MyProtectedAS{
	
	public static void main(String args[]){
		
		MyProtectedASTest obj = new MyProtectedASTest();
		
		//obj.test2(); should be accessible after inheritance
		// yellow rhombus = protected class = accessible within package only
		obj.test1();
	
		obj.test2(); //should be accessible after inheritance
	}


}
