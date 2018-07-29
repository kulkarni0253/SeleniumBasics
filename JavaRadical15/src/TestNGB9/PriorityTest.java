package TestNGB9;

import org.testng.annotations.Test;

public class PriorityTest {
	
	// its executed as per priority given, if not given the first which is not given priority, that is executed first alphabetically, then priorities work
	// we can use -1 priority as well, and that works first similair to -1
	
	String userName;
	
	@Test
	public void login1(){
		System.out.println("I am in test 2");
	}
	
	@Test 
	public void login(){
		System.out.println("I am in test 2");
	}
	
	@Test
	public void createU(){
		System.out.println("I am in test 1");
		//create user
		userName= "Anil_timestamp" ;
	}
	
	@Test
	public void aaa(){
		System.out.println("I am in test 2");
		//update user
		String updateUser = userName;
	}
	
	@Test
	public void deleteU(){
		System.out.println("I am in test 2");
	}
	
	@Test
	public void createG(){
		System.out.println("I am in test 2");
	}

}
