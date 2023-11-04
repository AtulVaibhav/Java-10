
public class Test4 extends Thread{
    public void run(){
    	for(int i=1;i<=10;i++){
    		System.out.println(Thread.currentThread().getName()+"--->"+i);
    	}
    }
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		Test4 t = new Test4();
		t.setName("A");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Test4 t2 = new Test4();
		t2.setName("B");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		System.out.println(Thread.currentThread().getName()+" completed its task");
		

	}

}
