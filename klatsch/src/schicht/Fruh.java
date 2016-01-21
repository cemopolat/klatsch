package schicht;
/*dieses Schicht von Dienstag bis Freitag von 10.30 - 15.00 Uhr Schicht
 * und arbeitet zwei person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddTwoPersons; 


public class Fruh extends Schicht {
	private String beschreibung = "";
	
	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons();
	}
	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return beschreibung;
	}

	
}
