package schicht;
/*dieses Schicht am wochenenden von 08.00 - 14.00 Uhr Schicht
 * und arbeitet drei person
 * 
 */

import java.util.ArrayList;

import person.Person;
import personInterface.AddThreePersons;

public class WEFruh1 extends Schicht{
	
	@Override
	public void addPerson(Person p) {
		personInterface = new AddThreePersons();
		
	}
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 3;
	private String beschreibung = "am wochenende Branch Schicht von 08.00 - 14.00 Uhr Schicht";


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
