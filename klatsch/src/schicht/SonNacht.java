package schicht;

import person.Person;
import personInterface.AddTwoPersons;

public class SonNacht extends Schicht {
	

	@Override
	public void addPerson(Person p) {
		personInterface = new AddTwoPersons(); 
		
	}

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
