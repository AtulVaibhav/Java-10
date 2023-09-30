// loops ,switch
public class BreakStatement {

	public static void main(String[] args) {
	  for(int i=0;i<=5;i++){
		  if(i==3){
			  break;
		  }
		  System.out.println(i);
	  }
	  System.out.println("Out of the loop");
	  
	  System.out.println("---------------------------------");
	  for(int i=11;i<=15;i++){ 
		  for(int j=11;j<=15;j++){
		  			if(i==13){//behaves like continue 
		  			  break;
		  		  }

			  
			  System.out.println(i+"---->"+j);
		  }
	  }

	}

}
