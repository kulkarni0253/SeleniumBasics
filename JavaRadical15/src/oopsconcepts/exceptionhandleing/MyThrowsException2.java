package oopsconcepts.exceptionhandleing;

import java.io.IOException;
import java.sql.SQLException;

public class MyThrowsException2 {
	
	static MyThrowsException2 obj;
	
	void method() throws IOException {
			throw new IOException("Error Observed");
	}
		
	void method1() throws SQLException{
		throw new SQLException("SQL Exception");
	}
	
	public static void main(String args[]) throws IOException, SQLException {
		obj = new MyThrowsException2();
		try{
		obj.method1();
		}catch (SQLException e){
			System.out.println("in SQL exception");}
//		catch(IOException e){
//			System.out.println("in IO exception");
//		}
		System.out.println("regular code flow");
	}

}
