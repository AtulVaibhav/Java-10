
class SharedResource{
	public synchronized void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Tthread extends Thread{
	private SharedResource resource;

	public Tthread(SharedResource resource) {
		super();
		this.resource = resource;
	}
	
	public void run(){
		this.resource.printTable(2);
	}
	
}

class T2thread extends Thread{
	private SharedResource resource;

	public T2thread(SharedResource resource) {
		super();
		this.resource = resource;
	}
	
	public void run(){
		this.resource.printTable(5);
	}
}




public class Test5 {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		Tthread t = new Tthread(resource);
		T2thread t2 = new T2thread(resource);
		
		t.start();
		t2.start();
		

	}

}
