
import java.util.Scanner;

class AmazonRegisterUser{
	public static final String stored_username = "user1";
	public static final String stored_password = "user1";
}


public class UserLogin {
	
	public static boolean loginPage(Scanner sc){
		boolean login = false;
		System.out.println("Enter your username");
		String username = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
		
		if(username.equals(AmazonRegisterUser.stored_username) 
				&& password.equals(AmazonRegisterUser.stored_password)){
			login = true;
			return login;
		}
		return login;
		
		
	}
	
	public static void isUserLoggedIn(Scanner sc){
		 if(loginPage(sc)){
			 System.out.println("Welcome to Amazon");
		 }else{
			 System.out.println("Redirecting to loginPage");
			 boolean result = loginPage(sc);
			 if(result){
				 System.out.println("Welcome to Amazon");
			 }else{
				 System.out.println("Try again");
			 }
		 }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isUserLoggedIn(sc);
		
		
	}

}
