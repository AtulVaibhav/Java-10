// if(condition){state1   
//}else{}
//relational , logical:boolean
// / ,% : / = quotient   % = remainder


public class IF_ELse {
   public static void check(int num){ 
	  
	   if(num%2==0){
		   System.out.println(num+" is an even number");
	   }else{
		   System.out.println(num+" is an odd number");
	   }
   }
   
   public static boolean isPositive(int num){
	   boolean flag = false;
	   if(num>0){
		   flag = true;
		   return flag;
	   }
	   return flag;
	   
   }
   
   public static void checkName(String name){ 
	   if(name.equals("Rahul")){
		   System.out.println("Welcome "+name);
	   }else{
		   System.out.println("Welcome GuestUser");
	   }
   }
  
	public static void main(String[] args) {
		check(21);
		boolean result = isPositive(34);//false
		if(result){
			System.out.println("Positive number");
		}else{
			System.out.println("Negative Number");
		}
		
		checkName("Vinay");
  
	}

}
// equals() == : String(if you want to compare object content equals())
// == (if we want to compare whether both string objects pointing to same
//location
//String str = "Hello"
//String st1 = str  str==st1
//"efg".equals("def")





