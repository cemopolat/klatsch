package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 18.00 - 22.00 Uhr Schicht
 * und arbeitet nur ein person und 
 * dieses schicht wird nur im sommer als unterst�tzungskraft eingesetzt
 */

import java.util.ArrayList;

import person.Person;

public class SommerAbend extends Schicht {
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
