package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 15.00 - 20.00 Uhr Schicht
 * und arbeitet nur ein person*/

import java.util.ArrayList;

import person.Person;

public class NachMittag extends Schicht {
	private ArrayList<Person> pList = new ArrayList<Person>();
	private static final int ANZAHL = 1;

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

}
