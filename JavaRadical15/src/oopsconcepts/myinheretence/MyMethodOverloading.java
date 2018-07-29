package oopsconcepts.myinheretence;

public class MyMethodOverloading {
	//sequence, data type and parameter >> overloading concept
	
	public void method1(int i, int j){
		System.out.println("i ="+i+" j ="+j);
	}
	
	public void method1(int i, String j){
		System.out.println("i  ="+i+" j ="+j);
	}
	
	public void method1(String i, int j){
		System.out.println("i =" +i+ " j =" +j);
	}
	
	public void method1(String i, int j, int k){
		System.out.println("i= " +i+" j= " +j+" k= "+k);
	}

}
