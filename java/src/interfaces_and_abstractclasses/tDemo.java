package interfaces_and_abstractclasses;

public class tDemo {

	public static void main(String[] args) {

/*
 	  tBank t = new tBank();  // For interface we can't create object we get compile errors
      The only way is create child class object and access the methods
      
      Any static method is there we can call it by giving classname.methodname
*/		
		tBankaxis t = new tBankaxis();
		t.methodB();
		t.methodA();
		
		tBank.methodC();
	}

}
