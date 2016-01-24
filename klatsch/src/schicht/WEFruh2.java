package schicht;
/*dieses Schicht am wochenende von 10.00 - 16.00 Uhr Schicht
 * und arbeitet nur ein person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddOnePerson;

public class WEFruh2 extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddOnePerson();
		
	}
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "am wochenende von 10.00 Uhr bis 16.00 Uhr Schicht";

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return beschreibung;
	}

	@Override
	public double getSchichtdauer() {
		// TODO Auto-generated method stub
		return schichtdauer;
	}

}
