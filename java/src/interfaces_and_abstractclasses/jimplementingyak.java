package interfaces_and_abstractclasses;

public class jimplementingyak implements jimplementingwalk, jimplementingfly{

	@Override
	public void flying() {
		
		System.out.println(" yak is flying ");
	}

	@Override
	public void walking() {
		
		System.out.println(" yak is walking ");
	}

}
