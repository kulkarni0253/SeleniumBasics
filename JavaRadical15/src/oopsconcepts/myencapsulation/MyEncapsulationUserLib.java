package oopsconcepts.myencapsulation;

public class MyEncapsulationUserLib {
	
	public void createUser(MyEncapsulation obj){
		int emp = obj.getEmpID();
		
		if(emp!=0){
			System.out.println(emp);
		}
		
		String n = obj.getEmpName();
		if(n!=null){
			System.out.println(n);
		}
	}

}
