public class Test5 {
   public static <T,T2> void getData(T obj,T2 obj2) throws IllegalArgumentException, IllegalAccessException{
	   if(obj.getClass().toString().contains("java.lang.Integer") && obj2.getClass().toString().contains("java.lang.Integer")){
	      int data = Integer.parseInt(obj.toString());
	      int data2 = Integer.parseInt(obj2.toString());
	      System.out.println(data+data2);
		    
	   }else{
		   System.out.println(obj.toString()+ obj2.toString());
	   }
   }
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	getData(12,13);
	getData("Hello","World");

	}

}
