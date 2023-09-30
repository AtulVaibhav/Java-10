import java.util.Scanner;

class StoredPin {
	public static final String secretKey = "5346";

	public static String getKey() {
		return secretKey;
	}
}

class Banking {
	final static int minBal = 500;
	static int savedAmount = minBal;
	public static boolean keyValidation(String key) {
		boolean flag = false;
		if (StoredPin.getKey().equals(key)) {
			flag = true;
		}
		return flag;
	}

	public static void deposit(Scanner sc) {
          System.out.println("Enter the amount to deposit");
          int amount = sc.nextInt();
          savedAmount = savedAmount + amount;
	}

	public static void withdraw(Scanner sc) {
       System.out.println("Enter the amount to withdraw");
       int withdrawAmount = sc.nextInt();
       if((savedAmount-minBal)>=withdrawAmount){
    	   System.out.println("Amount debited successfully");
    	   savedAmount = savedAmount - withdrawAmount;
       }else{
    	   System.out.println("Insufficient balance");
       }
	}

	public static void balEnquiry() {
        System.out.println(savedAmount);
	}

}

public class ATM {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC ATM");
		int counter =0;
		while(counter<3){
		System.out.println("Enter the secret key");
		String key = sc.next();
		
		if (Banking.keyValidation(key)) {
			do {
				System.out.println("1.Deposit  2.Withdraw  3.Balenq");
				System.out.println("Select any option");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					Banking.deposit(sc);
					break;
				case 2:
					Banking.withdraw(sc);
					break;
				case 3:
					Banking.balEnquiry();
					break;

				default:
					System.out.println("Invalid option");

				}
				System.out.println("Do you want to continue :y/n");
				ch = sc.next().charAt(0);
			} while (ch == 'y');
			break;	
		} else {
			counter++;
			System.out.println("Wrong pin..");
		}
		}
		if(counter==3){
			System.out.println("Card blocked..Please contact with the nearest bank");
		}
		System.out.println("Thanks for using ABC ATM");

	}

}
