package personInterface;

import java.util.ArrayList;

import person.Person;

public class PersonVerwaltung {

	private ArrayList<Person> persons = new ArrayList<Person>();
	private boolean isShiftFull = false;
	private int besatzung;

	public PersonVerwaltung(int besatzung) {
		this.besatzung = besatzung;
	}
	
	/**
	 * @param person
	 */
	public void addPerson(Person person) {
		if (!persons.contains(person) && besatzung <= persons.size()) {
			System.out.println("Schicht ist voll!");
		} else if (!persons.contains(person)) {
			persons.add(person);
			isShiftFull = true;
		} else {
			System.out.println(person.getNachname() + " " + person.getVorname() + " ist schon in der Schicht!");
		}
	}
	
	/* (non-Javadoc)
	 * @see personInterface.PersonInterface#getPersons()
	 */
	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public boolean getIsShiftFull() {
		return isShiftFull;
	}
}
