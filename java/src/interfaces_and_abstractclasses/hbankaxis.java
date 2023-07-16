package interfaces_and_abstractclasses;

public abstract class hbankaxis implements hbank {

	// In this case if you remove one implemented method it gives you error to overcome this error we put
	// abstract infront of class.

	@Override
	public void withdrawAmount() {
		
		System.out.println(" withdraw Amount from Axis bank Account ");
		
		
	}

	@Override
	public void openFixedDeposite() {

		System.out.println(" Opening Fixed Deposite in Axis bank ");
		
	}
	
	public void openFlexibleFixedDeposite()
	{
		 
	}

}
