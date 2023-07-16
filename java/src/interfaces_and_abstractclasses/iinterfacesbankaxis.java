package interfaces_and_abstractclasses;

public class iinterfacesbankaxis implements iinterfacesbank{

	@Override
	public void depositeAmount() {

		System.out.println(" Deposite amount in Axis bank ");
		
	}

	@Override
	public void FixedDeposite() {

		System.out.println(" Fixed Deposite in Axis bank ");
		
	}

	@Override
	public void withdrawAmount() {

		System.out.println(" withdraw amount from Axis bank ");
	}
	
	public void openFlexibleFixedDeposite() {

		System.out.println(" Open Flexible Fixed Deposite in Axis bank ");
		
	}
	

}
