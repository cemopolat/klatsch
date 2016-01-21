package schicht;
/*dieses Schicht am Freitag von 11.30 - 16.00 Uhr Schicht
 * und arbeitet nur ein person*/

import person.Person;

public class FMittag extends Schicht{
	private String beschreibung = "";

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return beschreibung;
	}

}
