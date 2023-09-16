import java.util.Scanner;

class Storage{
	public static final String stored_username = "admin";
	public static final String stored_password = "admin";
}
public class LoginSystem {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your userName");
	   	String username = sc.next();
	   
	   	if(username.equals(Storage.stored_username)){
	   		System.out.println("Enter your password");
		   	String password = sc.next();
	   		if(password.equals(Storage.stored_password)){
	   			System.out.println("Welcome "+username);
	   		}else{
	   			System.out.println("Invalid password");
	   		}
	   	}else{
	   		System.out.println("Invalid username");
	   	}
	   	

	}

}
