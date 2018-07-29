package basic;

public class MyStaticVariable {
	
	int variable1 = 0;
	MyStaticVariable() {
		variable1++;
		System.out.println(variable1);
		
	}
	public static void main(String args[]){
		MyStaticVariable obj1 = new MyStaticVariable();
		MyStaticVariable obj2 = new MyStaticVariable();
		MyStaticVariable obj3 = new MyStaticVariable();	
	}

}
