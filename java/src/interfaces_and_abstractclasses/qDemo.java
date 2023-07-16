package interfaces_and_abstractclasses;

public class qDemo {

	public static void main(String[] args) {

//		qAnimal a = new qAnimal();		For abstract classes in java we can't create objects
		
		qBird b = new qBird();
		b.legscount = 4;
		b.speed = 100;
		b.sleeping();
		b.eating();
		
	}

}
