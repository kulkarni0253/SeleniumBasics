package accessspecifier.C;

import accessspecifier.A.MyImportClass;


public class MyImportClassTest {
	
	public static void main(String args[]){
		
		MyImportClass obj = new MyImportClass();
		obj.m1();
		
		accessspecifier.B.MyImportClass obj1 = new accessspecifier.B.MyImportClass();
		
	// to access same class name from different package, use this method ; type some part of class and press control enter then se;ect required import class
		obj1.m1();
		
	
		
	}

}
