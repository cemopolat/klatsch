package schicht;
/*dieses Schicht nur am wochenende von 16.00 - 22.00 Uhr Schicht
 * und arbeitet nur ein person
 * ab 20.00 uhr bis 22.00 uhr ist bereitschaft
 */
import java.util.ArrayList;

import person.Person;

public class WEAbend extends Schicht{
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
