package basic.basic1;

public class MyTest {

	public static void main(String[] args) {
		
		HomePage obj = new HomePage();
		obj.clickFinishButton();
		obj.clickCancelBUtton();
		obj.enterUserName();
		obj.enterMobileNumber();
		
		UserDetailsPage obj1 = new UserDetailsPage();
		obj1.createUser("SUNIL", "PUNE", 9822773328L);
		obj1.createUser("HARSHAL", "MUMBAI", "DADAR", 8655794327L);
		obj1.isUserCreated(true);
		
		}

}
