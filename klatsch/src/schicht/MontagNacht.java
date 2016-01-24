package schicht;
/*dieses Schicht am Montag von 19.00 - 01.00 Uhr Schicht
 * und arbeitet nur zwei person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddTwoPersons;

public class MontagNacht extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons();
				
	}
	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 2;
	private String beschreibung = "nur am Montag Abend von 19.00 Uhr bis 01.00 Uhr Schicht"; 

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSchichtdauer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
