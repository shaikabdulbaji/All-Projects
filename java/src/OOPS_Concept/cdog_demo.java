package OOPS_Concept;

public class cdog_demo {

	public static void main(String[] args) {

		bdog d = new bdog();
		d.breed = "Doberman";
		d.name = "Ginger";
		d.color = "Black";
		
		d.barking();
		d.eating();
		d.sleeping();
		d.running();
		
		bdog d1 = new bdog();
		d1.breed = "Pug";
		d1.name = "Ruby";
		d1.color = "Brown";
		
		d1.barking();
		d1.eating();
		d1.sleeping();
		d1.running();
		
		bdog d2 = new bdog();
		d2.breed = "Dalmition";
		d2.name = "Piper";
		d2.color = "White";
		
		d2.barking();
		d2.eating();
		d2.sleeping();
		d2.running();
	}

}
