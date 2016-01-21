package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 12.00 - 18.00 Uhr Schicht
 * und arbeitet nur ein person*/

import java.util.ArrayList;

import person.Person;
import personInterface.AddOnePerson;
import personInterface.PersonInterface;

public class Mittag extends Schicht {
	
	public void addPerson (Person p){
	
		personInterface = new AddOnePerson();
		
	}
	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 1;
	private String beschriftung = "in der woche von 12.00 Uhr bis 18.00 Uhr schicht";
	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}

}
