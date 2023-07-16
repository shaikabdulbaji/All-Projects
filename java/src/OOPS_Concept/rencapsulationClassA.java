package OOPS_Concept;

public class rencapsulationClassA {
	
/*
	public int a;
	public int b;
	public int c;
	
	These are the variables that are access out of the class, to make not to access throuh out the class we use private insted of public
	
*/
	
	private int a;
	private int b;
	private int c;
	
	// We can't access these variable out of the class, to access these we want to use Getter and Setter methods
	
	public void setA(int a)
	{
		this.a = a;
	}
	
	public int getA()
	{
		return this.a;
	}

}
