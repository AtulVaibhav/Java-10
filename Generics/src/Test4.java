import java.util.Arrays;
import java.util.List;

public class Test4 {
	public static double getValue(List<? extends Number> list){
		double sum = 0;
		for(int i=0;i<list.size();i++){
			sum = sum+list.get(i).doubleValue();
		}
		return sum;
	}
	
	public static void getValue2(List<? super Integer> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
         System.out.println(getValue(list));
         
         getValue2(list);
         
         List<Double> list2 = Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7);
         //getValue2(list2);
         
         List<Object> list3 = Arrays.asList("Hello",1.2,2.3f,11,'c');
         getValue2(list3);
         
         List<Number> list4 = Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7);
         getValue2(list4);
         
         
         
         
         
	}

}
