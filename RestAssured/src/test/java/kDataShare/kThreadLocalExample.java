package kDataShare;

public class kThreadLocalExample {

	public static void main(String[] args) {

		// ThreadLocal is a class in Java
		// Any generic class we can create object without passing generics as well
		
		ThreadLocal counter1 = new ThreadLocal();		
		counter1.set("Abdul");
		String name = (String) counter1.get();
		System.out.println(name);
		
		counter1.remove();
		System.out.println((String) counter1.get());
		
		// Return Type of String is "null"
		
		/*
		 * ThreadLocal counter1 = new ThreadLocal();		
		   counter1.set("Abdul");
		 * Instead of above two lines we use the below method also like "withInitial()".
		 */
		
		ThreadLocal counter2 = ThreadLocal.withInitial(()-> "Shaik");
		System.out.println((String)counter2.get());
		
		ThreadLocal<String> counter3 = new ThreadLocal<String>();
		counter3.set("Baji");
		System.out.println(counter3.get());
	}

}
