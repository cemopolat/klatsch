package schicht;
/*dieses Schicht am wochenenden von 08.00 - 14.00 Uhr Schicht
 * und arbeitet drei person
 * 
 */

import java.util.ArrayList;

import person.Person;

public class WEFruh1 extends Schicht{
	private ArrayList<Person> pList = new ArrayList<Person>();
    private static final int ANZAHL = 3;
	

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
