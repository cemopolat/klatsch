package schicht;
/*dieses Schicht am  Freitag  und Samstag Nacht von 20.00 - 02.00 Uhr Schicht
 * und arbeitet drei personen
 */

import java.util.ArrayList;

import person.Person;
import personInterface.AddThreePersons;

public class WENacht extends Schicht {
	
	@Override
	public void addPerson(Person p) {
		personInterface = new AddThreePersons();
		
	}
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 3;
	private String beschreibung = "freitag und Samstag von 20.00 Uhr bis 02.00 Uhr Schicht";

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
