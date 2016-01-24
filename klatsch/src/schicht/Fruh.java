package schicht;
/*dieses Schicht von Dienstag bis Freitag von 10.30 - 15.00 Uhr Schicht
 * und arbeitet zwei person*/

import person.Person;
import personInterface.AddTwoPersons; 


public class Fruh extends Schicht {
		
	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons();
	}
	
	private double schichtdauer = 5.5;
	private double schichtPause = 0.5;
	private int besatzung = 2;
	private String beschreibung = "in der woche von 10.30 Uhr bis 15.00 Uhr Schicht";
	
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
