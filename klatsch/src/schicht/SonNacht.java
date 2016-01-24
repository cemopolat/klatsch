package schicht;

/* Diese Schicht ist am Sonntag von 20.00 - 01.00 Schicht
 * arbeitet zwei Personen
 *  */

import java.util.ArrayList;

import person.Person;
import personInterface.AddTwoPersons;

public class SonNacht extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons(); 
		
	}

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
