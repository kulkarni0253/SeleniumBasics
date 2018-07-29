package basic;

public class MyBasicsOfMethods {
	
	int i =10;
	String s="Harshal";
		
	public boolean test1(int i, String name){
		System.out.println("in test 1:"+i);
		System.out.println("in test1 :"+s);
		return true;
	}
		
	public void test2(){
		System.out.println("in test 2");
		
	}
	
	public int test3(int i, boolean b){
		System.out.println("in test 3: "+i);
		System.out.println("in test 3: "+b);
		return i*i;
	}
		
		
		
}
