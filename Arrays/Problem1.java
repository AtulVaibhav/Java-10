
public class Problem1 {
    public static int sumOfEvenNumbers(int[] arr){
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]%2==0){
    			sum = sum+arr[i];
    		}
    	}
    	return sum;
    }
    public static int sumOfElements(int[] arr){
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    			sum = sum+arr[i];
    	}
    	return sum;
    }
     public static int searchKey(int[] arr,int key){
    	 int pos = -1;//indication of unsuccessful operation
    	 for(int i=0;i<arr.length;i++){
    		 if(key==arr[i]){
    			 pos = i;
    			 return pos;
    		 }
    	 }
    	 return pos;
     }
    
    public static String count0And1(int[] arr){
    	int count_0 = 0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==0){
    			count_0++;
    		}
    	}
    	int count_1 = arr.length-count_0;
    	return "Count of 0's = "+count_0+".Count of 1's = "+count_1;
    }
    
    public static int[] sort0and1(int[] arr){
    	int[] temp = new int[arr.length];//creating an arr
    	int count_0 = getCount(arr);
    	int index_0 = 0;
    	int index_1 =count_0; 
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==0){
    			temp[index_0++] = 0;
    		}else{
    			temp[index_1++] = 1;
    		}
    	}
    	return temp;
    	
    }
    
	private static int getCount(int[] arr) {
		int count=0;
		for(int data:arr){
			if(data==0) count++;
		}
		return count;
	}
	
	public static void getIndex(int[] arr,int sum){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==sum){
					System.out.println("Index position of first value = "+i
							+"("+arr[i]+")"+
							" ,Index position of second value = "+j+"("+arr[j]+")");
				}
			}
		}
	}
	
	public static void rotateByOne(int[] arr){
		int data = arr[arr.length-1];
		for(int i= arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = data;
		
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//1.WAP to find the sum of even elements in given array
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("Sum of even numbers :"+sumOfEvenNumbers(arr));
		
		//2.WAP to get sum of all digits in given array
		int[] arr2 = {21,22,23,24,25};
		System.out.println("Sum of elements :"+sumOfElements(arr2));
		
		//3.WAP to find the index position of given element in an array.If
		//not found return -1;
		int key = 23;
		int[] arr3 = {23,2,5,27,36};
		int index = searchKey(arr3, key);
		if(index>=0){
			System.out.println("Element found at index position :"+index);
		}else{
			System.out.println("Element not found ");
		}
		
		//WAP to find the count of 0's and 1's
        int[] arr4 = {0,1,1,0,0,0,1,1,1,1,0};
        System.out.println(count0And1(arr4));
        
        
        
        //WAP to put all 0's to left and all 1's to right
        int[] arr5 = {0,1,1,0,0,0,1,1,1,1,0};
        int[] result = sort0and1(arr5);
        System.out.print("[");
        for(int data: result){
        	System.out.print(data+" ");
        }
        System.out.println("]");
        
        //WAP to find all the pair of elements whose sum is equal to k(Two sum problem)
        int[] arr6 = {0,3,2,4,1,6,5,9,10,11};
        int sum=11;
        getIndex(arr6, sum);
        
        //WAP to rotate an array by k position  
        int[] arr7 = {21,19,22,35,14};
        int k=3;
        rotateByOne(arr7);
        
        //WAP to get all sub-array whose sum is equals to k;
        int[] arr8 = {3,2,4,1,1,6,5,9,10,1,11};
        int k2 = 11;
	}

}
