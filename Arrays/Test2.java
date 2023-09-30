
public class Test2 {

	public static void main(String[] args) {
		//declare and define 2D-Array:Array of Arrays
		//data_type [][] ref = {{},{},{}};
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{6,7,6}		
		};
		
		System.out.println(arr.length);
		
		
		int[][] arr2 = new int[2][];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		 
	}

}
