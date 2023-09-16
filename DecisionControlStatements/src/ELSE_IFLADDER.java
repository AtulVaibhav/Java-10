import java.util.Scanner;

/*if(condition){
 * }else if(condition){
 * }else if(condition){
 * }else{
 * if(){}else
 * }
 * 
 * 
 */
public class ELSE_IFLADDER {
	
	public String getResult(int average){
		System.out.println(average);
		if(average>=80){
			//System.out.println("Distinction");
			return "Distinction";
		}else if(average>=60 && average<80){
			//System.out.println("First class");
			return "First class";
		}else if(average>=35 && average<60){
			//System.out.println("Second class");
			return "Second class";
		}else{
			//System.out.println("Try next year");
			return  "Try next year";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		int sum = sub1+sub2+sub3+sub4+sub5;
		int average = sum/5;
		
		ELSE_IFLADDER obj = new ELSE_IFLADDER();
		String str = obj.getResult(average);
		System.out.println(str);
		
		// condition ? stat1 : state2

	}

}
