package schicht;
/*dieses Schicht am Sonntag von 12.00 - 18.00 Uhr Schicht  
 * von 11.00 - 12.00 ist bereitschaft
 * und arbeitet nur ein person
 */
import java.util.ArrayList;

import person.Person;
import personInterface.AddOnePerson;

public class WEMittag3 extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddOnePerson();
	}
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "nur am Sonntag von 12.00 Uhr bis 18.00 Uhr ab 11.00 Uhr bereitschaft";

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

}
