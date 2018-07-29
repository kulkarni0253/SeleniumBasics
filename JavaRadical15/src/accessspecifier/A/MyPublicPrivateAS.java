package accessspecifier.A;

public class MyPublicPrivateAS {
	public int i =10;
	private int j=20;
	
	public void test1(){
		System.out.println("in test 1");
	}
	
	public void test2(){
		System.out.println("in test 2");
	}
	
	public void test3(){
		System.out.println("in test 3");
	}
	
	public static void main(String main[]){
		
		MyPublicPrivateAS obj = new MyPublicPrivateAS();		
		int k = obj.i;
		int l = obj.j;				
		obj.test1();
		obj.test2();
		obj.test3();
		
	}
	

}
