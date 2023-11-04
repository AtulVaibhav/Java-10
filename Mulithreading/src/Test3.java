
class Resource{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}



class T_1 extends Thread{
	private Resource resource;

	public T_1(Resource resource) {
		super();
		this.resource = resource;
	}
	
	public void run(){
		this.resource.printTable(2);
	}
	
}

class T2 extends Thread{
	private Resource resource;

	public T2(Resource resource) {
		super();
		this.resource = resource;
	}
	
	public void run(){
		this.resource.printTable(5);
	}
}


public class Test3 {

	public static void main(String[] args) {
		Resource r = new Resource();
		T_1 t = new T_1(r);
		T2 t2 = new T2(r);
		t.setName("A");
		t2.setName("B");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
