
public class NestedIF_ELSE {
	
	//if(){ if(){}}else{}
	
	public static void show(int rollNumber,String name){
		if(rollNumber==101){
			if(name.equals("Rahul")){
				System.out.println("Got highest marks");
			}
		}else{
			System.out.println("Student not found");
		}
	}

	public static void main(String[] args) {
		show(102,"Rahul");

	}

}
