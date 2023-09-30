
public class Test3 {

	public static void main(String[] args) {
		//jagged array
		int[][] arr = {
				{1,2,3},
				{21,22},
				{31}
		};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
