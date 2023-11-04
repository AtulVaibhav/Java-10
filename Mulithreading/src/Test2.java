
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"---->"+i);
		}
	}
}


public class Test2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		// setting the name of thread
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();

	}

}
