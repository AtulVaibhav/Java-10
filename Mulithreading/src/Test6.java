
class NewThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello Thread");
		
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		NewThread t = new NewThread();
		Thread th = new Thread(t);
		th.start();

	}

}
