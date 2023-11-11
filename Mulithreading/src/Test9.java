
//general,base
public class Test9 {
	 public static void main(String[] args) 
	    {
	        String s1 = new String();
	        s1 = null;
	        System.gc();
	        System.out.println("Garbage collector is called");   
	    }
	    
	    @Override
	    protected void finalize()
	    {
	        System.out.println("Finalize method is called.");
	    }

}
