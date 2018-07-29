package basic;

public class MyTwoDimensionalArray {
	public static void main(String args[]){
		
		int arr[][] = {{0,4,3},
					   {1,5,6},
					   {2,7,8},
					   {3,11,12}};
		System.out.println("Printing Array = "+ arr[0][2]);
		
		for(int i =0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
