package accessspecifier.A;

public class MyPublicPrivateASTest {
	
	public static void main(String args[]){
		MyPublicPrivateAS obj = new MyPublicPrivateAS();
		int x = obj.i;
		obj.test1(); // we are able to access only public variable and method
	}

}
