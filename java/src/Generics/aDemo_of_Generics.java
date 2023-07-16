package Generics;

public class aDemo_of_Generics {

	public static void main(String[] args) {

/*
			
		Generics :
		--------- 
		Since Collections are not type safe i.e programmer can add any types of +
		+ objects there is no restriction for that so, to overcome this drawback JAVA +
		+ has given Generics concept where you can create an object of specific type, + 
		+ if we add any other type of object than specified we will get CTE. 
		
		1. ArrayList<Integer> a1=new ArrayList<>();
		a1.add("java");//CTE 
		a1.add(100); 
		a1.add('A');//CTE 
		
		2. ArrayList<String> a1=new ArrayList<>();
		a1.add("java"); 
		a1.add(100);//CTE 
		a1.add('A');//CTE 
		
		3. ArrayList<Character> a1=new ArrayList<>();
		a1.add("java");//CTE 
		a1.add(100);//CTE 
		a1.add('A'); 
		
		Ex :
		import java.util.*; 
		public class Second 
		{ 
			public static void main(String[] args) 
			{ 
			
				ArrayList<Integer> a1=new ArrayList<>(); 
				a1.add(111); 
				a1.add(222); 
				System.out.println("Integer array list : "+a1); 
				/*a1.add('A');
				a1.add("Java");
				
				ArrayList<String> a2=new ArrayList<>(); 
				a2.add("java"); 
				a2.add("sql"); 
				System.out.println("String array list : "+a2); 
				
				ArrayList<Object> a3=new ArrayList<>(); 
				a3.addAll(a1); 
				a3.addAll(a2); 
				System.out.println("Object array list : "); 
				
				//for each loopto retrive
				for(Object data:a3) 
				{ 
				System.out.println(data); 
				} 
			}
		} 
		Output:
		Integer array list : [111, 222] 
		String array list : [java, sql] 
		Object array list : 
		111 
		222 
		java 
		sql 
		
*/		
		
		
	}

}
