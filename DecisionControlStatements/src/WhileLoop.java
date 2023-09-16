
public class WhileLoop {
    public static int reverse(int num){
    	int rev = 0;
    	while(num>0){
    		int rem = num%10;
    		int quo = num/10;
    		num = quo;
    		rev  = rev *10+rem;	
    	}
    	return rev;
    }
    
    public static void isPalindrome(int num){
    	int reverseNumber =reverse(num) ;
    	if(reverseNumber==num){
    		System.out.println("Palindrome");
    	}else{
    		System.out.println("Not a palindrome");
    	}
    }
    
    
    public static void isArmStrong(int num){
    	int temp = num;
    	int sum=0;
    	while(temp>0){
    		int rem = temp%10;
    		temp = temp/10;
    		sum = sum + (rem*rem*rem);
    		//sum = (int) (sum + Math.pow(rem, 3));
    	}
    	if(sum==num){
    		System.out.println("Armstrong number");
    	}else{
    		System.out.println("Not an armstrong");
    	}
    }
    
    
    
    
    
	public static void main(String[] args) {
	 // isPalindrome(121);
		isArmStrong(127);

	}

}
