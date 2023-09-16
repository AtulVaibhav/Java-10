import java.util.Scanner;

public class ForLoop {
	
	public static void printEven(int startingPoint,int endingPoint){
		for(int i =startingPoint;i<=endingPoint;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int num){
		boolean flag = true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Enter the range");
    //int startingPoint = sc.nextInt();
    //int endingPoint = sc.nextInt();
    //printEven(startingPoint, endingPoint);
    
    int num = 7;
    boolean result = isPrime(num);
    if(result){
    	System.out.println(num +" is a prime number");
    }else{
    	System.out.println(num +" is not a prime number");
    }

	}

}
