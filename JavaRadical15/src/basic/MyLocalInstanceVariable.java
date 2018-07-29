package basic;

public class MyLocalInstanceVariable {
	
	static int i = 10;
	
	public static void main(String args[]){
		int i = 20;
		System.out.println("Local I printed: "+i);
	}

}
