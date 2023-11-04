
//how to create a thread: Thread class, Runnable interface
class T1 extends Thread{
	//task assigned to thread
	 public void run(){
		 System.out.println(Thread.currentThread().getName()+" is executing run");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }	
}
public class Test {
    
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" is executing main");
		T1 t = new T1();//New
		//ThreadScheduler
		t.start();
		//t.start();
	}

}
// New >Runnable >Running >blocked >Terminated