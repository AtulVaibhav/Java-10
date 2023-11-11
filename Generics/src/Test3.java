
public class Test3 {
   public <T extends Number> double getSum(T[] arr){
	   double sum=0;
	   for(T element:arr){
		   sum = sum + element.doubleValue(); 
	   }
	   return sum;
   }
	public static void main(String[] args) {
		Test3 t = new Test3();
		Integer[] arr = {1,2,3,4,5,6};
		Double[]  arr1 = {1.1,1.2,1.3,1.4};
		Float[] arr2 = {1.2f,2.2f,3.3f,4.4f};
		System.out.println("Integer sum :"+t.getSum(arr));
		System.out.println("Double sum :"+t.getSum(arr1));
		System.out.println("Float sum :"+t.getSum(arr2));
		
		String[] str = {"Hello","World"};
		//t.getSum(str);

	}

}
