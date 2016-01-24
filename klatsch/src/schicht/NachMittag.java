package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 15.00 - 20.00 Uhr Schicht
 * und arbeitet nur ein person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddOnePerson;

public class NachMittag extends Schicht {
	
	@Override
	public void addPerson(Person p) {
		personInterface = new AddOnePerson();
		
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
