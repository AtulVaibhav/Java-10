import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//create an array: data_type [] name ={};
		//index position:0
		// last_Index = length-1;
//		int[] arr = {1,2,3,4,5};
//		
//		int[] arr2 = new int[5];
//		arr2[0] = 11;
//		arr2[1] = 11;
//		arr2[2] = 11;
//		arr2[3] = 11;
//		arr2[4] = 11;
//		
//		//Access the elements:
//		//System.out.println(arr[4]);
//		
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//		
//		//enhanced for loop
//		for(int data:arr){
//			System.out.println(data);
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the sie of an array");
//		int size = sc.nextInt();
//		
//		int[] arr = new int[size];
//		System.out.println("Enter the elements");
//		for(int i=0;i<size;i++){
//			arr[i] = sc.nextInt();	
//		}
//		
//		System.out.println("Elements are:");
//		for(int ele:arr){
//			System.out.print(ele+" ");
//		}
     System.out.println("-----------------------------------");		
		int[] array = {1,2,3,4,5,6};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("Using enhanced for loop");
		for(int data :array){
			System.out.println(data);
		}
		
		
		
		
		

	}

}
