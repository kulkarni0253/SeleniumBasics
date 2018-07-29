package basic.basic1;

public class UserDetailsPage extends ParentPage {
	
	public void createUser(String name, String address, long mobile ){
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
		}
	
	public void createUser(String name, String address, String city, long mobile){
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("Mobile: "+mobile);
		
		}
	
	public boolean isUserCreated(boolean b){
		System.out.println("User is Created: "+b);
		return true;
		
		
	}
	}
	
	

