
public class StarPatterns {
    public static void rightAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=1;j<=i;j++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    public static void reverseRightAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=i;j<=num;j++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    public static void leftAngledTriangle(int num){
    	 for(int i=1;i<=num;i++){
    		 for(int j=i;j<=num-1;j++){
    			 System.out.print("   ");
    		 }
    		 for(int k=1;k<=i;k++){
    			 System.out.print(" * ");
    		 }
    		 System.out.println(); 
    	 }
    	 
    	 System.out.println();
    }
    
    public static void reverseLeftAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=1;j<=i;j++){
    			System.out.print("   ");
    		}
    		for(int k=i;k<=num;k++){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    public static void PyramidPattern(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=i;j<=num-1;j++){
    			System.out.print("   ");
    		}
    		for(int k=1;k<=i;k++){
    			System.out.print(" * ");
    		}
    		for(int l=2;l<=i;l++){
    			System.out.print(" # ");
    		}
    		
    		System.out.println();
    	}
    }
    
    
	public static void main(String[] args) {
//		rightAngledTriangle(10);
//		reverseRightAngledTriangle(10);
//		leftAngledTriangle(10);
//		reverseLeftAngledTriangle(10);
		
		PyramidPattern(6);

	}

}
