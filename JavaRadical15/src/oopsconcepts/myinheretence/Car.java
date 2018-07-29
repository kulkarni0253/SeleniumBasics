package oopsconcepts.myinheretence;

public class Car {
	
	// parent object is not allowed to be used in Java, even by cast type method
	
	public void color(){
		System.out.println("Car : Colour : Red white black yellow");
	}
	
	public void speed(){
		System.out.println("Car : Speed : limit is 260") ;
	}
	
	public void engine(){
		System.out.println("Car : Engine : Capacity 3000cc");
		
	}
	
	public void wheels(){
		System.out.println("Car : Wheels : 4");
		System.out.println();
	}

}
