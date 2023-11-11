class GenericClass<T,T2>{
	private T obj;
	private T2 obj2;
	
	GenericClass(T obj,T2 obj2){
		this.obj = obj;
		this.obj2 = obj2;
	}
	public T getObj(){
		return this.obj;
	}
	public T2 getObj2(){
		return this.obj2;
	}
}
public class Test2 {

	public static void main(String[] args) {
//	 GenericClass<Integer> integerObj = new GenericClass<>(new Integer(10));
//	 System.out.println(integerObj.getObj() instanceof Integer);
//	 
//	 
//	 GenericClass<Double> doubleObj = new GenericClass<>(new Double(10.45));
//	 System.out.println(doubleObj.getObj() instanceof Double);

	}

}
