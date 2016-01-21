package schicht;
/*dieses Schicht am Wochenende von 14.00 - 20.00 Uhr Schicht
 * und arbeitet nur zwei person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddOnePerson;

public class WEMittag1 extends Schicht {


	@Override
	public void addPerson(Person p) {
		personInterface = new AddOnePerson();		
	}
	
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "am wochenende (Samstag und sonntag) von 14.00 Uhr bis 20.00 Uhr Schicht";

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

}
