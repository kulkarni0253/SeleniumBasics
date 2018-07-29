package oopsconcepts.myinheretence;

public class CarTest {
	
	public static void main(String[] args){
		
		Car obj = new Car();
		obj.color();
		obj.engine();
		obj.speed();
		obj.wheels();
		
		Maruti obj1 = new Maruti();
		obj1.wheels();
		obj1.speed();
		
		Car obj2 = new Maruti();
		obj2.wheels();
		obj2.color();
		obj2.speed();
		
//		Maruti obj3 = (Maruti) new Car();
//		obj3.color();	
	}

}
