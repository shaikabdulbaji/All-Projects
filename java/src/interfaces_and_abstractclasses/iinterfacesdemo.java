package interfaces_and_abstractclasses;

public class iinterfacesdemo {

	public static void main(String[] args) {

/*
		iinterfacesbank bank = new iinterfacesbank();   we can't create object for interfaces but we have one solution
		1st we create one child class and then we create object for that childclass and then implement all the methods
		in parent class and as well as child class.
		
		
		iinterfacesbankaxis is = new iinterfacesbankaxis();
		is.depositeAmount();
		is.FixedDeposite();
		is.withdrawAmount();
		is.openFlexibleFixedDeposite();
		
		
		iinterfacesbank b = new iinterfacesbank();  // While creating this we get an error to overcome this we create
		object for child class
		
		
		iinterfacesbank b = new iinterfacesbankaxis();
		b.depositeAmount();
		b.withdrawAmount();
		b.FixedDeposite();
		((iinterfacesbankaxis)b).openFlexibleFixedDeposite();   //By doing Typecaste only we can access it
*/
		String bankname = "HDFC";
		
		iinterfacesbank bank = null;
		
		if(bankname.equals("Axis"))
		{
			bank = new iinterfacesbankaxis();
		}
		else if(bankname.equals("HDFC"))
		{
			bank = new iinterfacesbankhdfc();
		}
		else if(bankname.equals("ICICI"))
		{
			bank = new iinterfacesbankicici();
		}
		
		bank.depositeAmount();
		bank.withdrawAmount();
		bank.FixedDeposite(); 
		
		
		
		
	}

}
