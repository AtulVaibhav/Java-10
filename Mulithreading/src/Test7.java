
class WritingEssentials{
	public static final String resource1 = "PEN";
	public static final String resource2 = "PAPER";
}

class T1A extends Thread{
	public void run(){
		System.out.println("Writing process started by T1A");
		  synchronized (WritingEssentials.resource1) {
			System.out.println("T1A got pen");
			System.out.println("Waiting for paper");
			synchronized (WritingEssentials.resource2) {
				System.out.println("T1A got paper");
				System.out.println("Writing process completed");
			}
			
		}
	}
}
class T2B extends Thread{
	public void run(){
		System.out.println("Writing process started by T2B");
		  synchronized (WritingEssentials.resource2) {
			System.out.println("T2B got paper");
			System.out.println("Waiting for pen");
			synchronized (WritingEssentials.resource1) {
				System.out.println("T2B got pen");
				System.out.println("Writing process completed");
			}
			
		}
	}
}

public class Test7 {

	public static void main(String[] args) {
		T1A t1 = new T1A();
		T2B t2 = new T2B();
		
		t1.start();
		t2.start();

	}

}
