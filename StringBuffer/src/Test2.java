
public class Test2 {

	public static void main(String[] args) {
		//Methods
		//1.Capacity
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("wikipediaefgthuth");
		System.out.println(sb.capacity());// 2*oldCapacity +2 :2*34 ; 70
        for(int i=97;i<=115;i++){
        	sb.append((char)i);
        }
        System.out.println(sb.capacity());
        
        //2.append()
        //3.insert()
        StringBuffer buffer = new StringBuffer();
        buffer.append("Java");
        buffer.insert(1, "Hello");
        System.out.println(buffer);
        
        //replace
        buffer.replace(1, 4,"Welcome");//1-3
        System.out.println(buffer);
        
        //deleteCharAt(index)
        buffer.deleteCharAt(1);
        System.out.println(buffer);
        
        //delete(start,end)
        buffer.delete(1, 4);
        System.out.println(buffer);
        
        //reverse()
        String obj = "Hello";
        StringBuffer obj2 = new StringBuffer(obj);
        System.out.println(obj2);
        obj2.reverse();
        System.out.println(obj2);
        
        //setCharAt()
        obj2.setCharAt(obj2.length()-1, 'k');
        System.out.println(obj2);
       
        //toString()
        StringBuffer buffer2 = new StringBuffer("Python");
        System.out.println(buffer2 instanceof StringBuffer);
        String data = buffer2.toString();
        System.out.println(data instanceof String);
        
        
	}

}
//Structural or Procedural
//Object-oriented 
//Functional Programming

