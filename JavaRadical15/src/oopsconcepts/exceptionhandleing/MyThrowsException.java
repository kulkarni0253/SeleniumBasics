package oopsconcepts.exceptionhandleing;

public class MyThrowsException {

		public static void result(int marks){
			if (marks <35){
				System.out.println("I'm in IF");
				throw new ArithmeticException("Failed in Maths");
			}else{
				System.out.println("WELCOME TO NEXT DIVISION");
			}
		}
		
		public static void main(String args[]){
			try{
				result(30);
			}catch(ArithmeticException e){
				
				System.out.println("in catch");
				
			}
			System.out.println("..REST OF THE CODE");
			
		}
		
		
	
	

}
