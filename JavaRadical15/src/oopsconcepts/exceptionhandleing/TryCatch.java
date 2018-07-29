package oopsconcepts.exceptionhandleing;

public class TryCatch {
	public static void main(String args[]){
		System.out.println("            !!!!! START OF THE PROGRAM !!!!!!!              ");
		
		try{
			int i=10;
			int k = i/0;
			System.out.println("value of k= "+k);
			System.out.println("ohh!!! so u r good at MATHS, nice");
		}
		
//		catch(Exception e){
//			System.out.println("In Generic Exception");			
//		}
		// if this generic exception is catched then u cannot have any other exceptions after this..so its recommended 
		// to have this after all specific exceptions are stated..
		// once any exception captured, no other will be considered by Java
		// to write program for checked exception : SQLException
		catch(ArithmeticException e){
			System.out.println("######Gotcha: In Arithemetic Exception");
			System.out.println("ummm..!!! Need to revise MATHS concepts.!");
		}
		
		finally{
			System.out.println("In Finally");
		}
		
		System.out.println("            !!!!!! END OF THE PROGRAM !!!!!!              ");
	}

}
