package interfaces_and_abstractclasses;

public class iinterfacesbankhdfc implements iinterfacesbank{

	@Override
	public void depositeAmount() {

		System.out.println(" Deposite amount in HDFC bank ");
		
	}

	@Override
	public void FixedDeposite() {

		System.out.println(" Fixed Deposite in Axis bank ");
		
	}

	@Override
	public void withdrawAmount() {

		System.out.println(" withdraw amount from HDFC bank ");

		
	}

}
