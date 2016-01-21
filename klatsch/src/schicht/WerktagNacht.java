package schicht;
/*dieses Schicht am werktagen von 20.00 - 02.00 Uhr Schicht
 * und arbeitet zwei personen*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddTwoPersons;

public class WerktagNacht extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons();
		
	}
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 2;
	private String beschreibung ="in der Woche von 20.00 Uhr bis 02.00 Uhr schicht";

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

}
