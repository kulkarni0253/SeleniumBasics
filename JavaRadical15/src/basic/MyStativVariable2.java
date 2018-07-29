package basic;

public class MyStativVariable2 {
	
	static int variable1 = 0;
	MyStativVariable2() {
		variable1++;
		System.out.println(variable1);
		
	}
	public static void main(String args[]){
		MyStativVariable2 obj1 = new MyStativVariable2();
		MyStativVariable2 obj2 = new MyStativVariable2();
		MyStativVariable2 obj3 = new MyStativVariable2();	
	}


}
