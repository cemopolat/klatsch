package schicht;

import java.util.ArrayList;

import person.Person;
import personInterface.PersonInterface;

public abstract class Schicht {
	
	// Object handler
	PersonInterface personInterface;

	// add person to shift
	public void addPerson(Person p) {
		personInterface.addPerson(p);
	}

	// remove person from shift
	public void removePerson(Person p) {
		if (personInterface.getPersons().contains(p)) {
			personInterface.getPersons().remove(p);
		}
	}
	
	public ArrayList<Person> getRawPersons() {
		return personInterface.getPersons();
	}
	
	/**
	 * @return String
	 */
	public String getPersonsAsAList() {
		StringBuilder sb = new StringBuilder(10);
		ArrayList<Person> persons = personInterface.getPersons();
		
		for (int i = 0; i < persons.size(); i++) {
			if (!(i == persons.size() - 1)) {
				sb.append(persons.get(i).getNachname() + " " + persons.get(i).getVorname() + ", ");
			} else 
				sb.append(persons.get(i).getNachname() + " " + persons.get(i).getVorname() + "\n");
		}
		
		return sb.toString();
		
	}
	
	public abstract String getBeschreibung();
}
