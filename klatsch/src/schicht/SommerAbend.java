package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 18.00 - 22.00 Uhr Schicht
 * und arbeitet nur ein person und 
 * dieses schicht wird nur im sommer als unterst�tzungskraft eingesetzt
 */

import personInterface.AddOnePerson;

import person.Person;
import personInterface.AddOnePerson;

public class SommerAbend extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddOnePerson();
		
	}
	
	private double schichtdauer = 4;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "nur im Sommer von 18.00 Uhr bis 22.00 Uhr Schicht";

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
