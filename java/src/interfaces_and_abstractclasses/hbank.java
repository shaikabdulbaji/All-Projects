package interfaces_and_abstractclasses;

public interface hbank {
	
	// In java classes are implemented by using " implements " keyword
	
	String ACCOUNT_TYPE_ONE = "Savings";
	String ACCOUNT_TYPE_TWO = "Current";
	
	void depositeAmount();
	
	void withdrawAmount();
	
	void openFixedDeposite();

}
