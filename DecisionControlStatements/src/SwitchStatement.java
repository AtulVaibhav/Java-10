import java.util.Scanner;

public class SwitchStatement {
    public static void add(int a,int b){
    	System.out.println("addition is performed");
    	System.out.println(a+b);
    }
    public static void subtract(){
    	System.out.println("subtract is performed");
    }
    public static void multiply(){
    	System.out.println("multiply is performed");
    }
	public static void main(String[] args) {
		char ch;
		do{
		
		 System.out.println("1.add  2.subtract 3.multiply");
        System.out.println("Select any operation");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice){
        case 1: add(1,2); 
                break;
        case 2: subtract();
                break;
        case 3: multiply();
                break;
        default:System.out.println("Invalid option");
        }
        System.out.println("Do you want to continue : Press- y/n");
         ch = sc.next().charAt(0);
		}while(ch=='y');
        
        System.out.println("out of switch statement");
	}

}
