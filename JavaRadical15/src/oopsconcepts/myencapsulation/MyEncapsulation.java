package oopsconcepts.myencapsulation;

public class MyEncapsulation {
	
	private int empid;
	private String empName;
	
	
	public void setEmpID(int i){
		empid = i;
	}
	
	public int getEmpID(){
		return empid;
	}
	
	public void setEmpName(String s){
		empName = s;
		
	if(s.equals("Anil")){
		empName = "Selenium Trainer: "+s;
		}else{
			empName = "Selenium Student: "+s;
		//if(s!="Anil"){
			//System.out.println("selenium students");
		//}else{
				//System.out.println("selenium trainer");
		}
}
	
	
	public String getEmpName(){
		return empName;
	}
	

}
