class Bank{
	int amount=5000;
	
	public synchronized void withdraw(int amt){
		System.out.println("trying to withdraw amount..");
		if(amt>amount){
			try {
				System.out.println("Waiting for amount to be deposited");
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		amount = amount-amt;
		System.out.println("Amount withdraw successfully...");
	}
	
	public synchronized void depositAmount(int amt){
		amount = amount+amt;
		System.out.println("Amount deposited successfully");
		notify();
	}
	
}

class Friend1 extends Thread{
	private Bank bank;
	Friend1(Bank bank){
		this.bank= bank;
	}
	public void run(){
		this.bank.withdraw(10000);
	}
}

class Friend2 extends Thread{
	private Bank bank;
	Friend2(Bank bank){
		this.bank = bank;
	}
	public void run(){
		this.bank.depositAmount(10000);
	}
}
public class Test8 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Friend1 f = new Friend1(bank);
		Friend2 f2 = new Friend2(bank);
		f.start();
		f2.start();
		
	}

}
