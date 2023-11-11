
public class Test10 extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Test10 t = new Test10();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}

}
