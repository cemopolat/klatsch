package personInterface;

import java.util.ArrayList;

import person.Person;

public class AddOnePerson implements PersonInterface {

	// TODO
	// Look for another collection for this TreeSet or table ??, size limit is important !!! 
	private ArrayList<Person> persons = new ArrayList<Person>();

	@Override
	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
		} else {
			System.out.println("Error!!! Person already in the schift !!!");

		}
	}

	@Override
	public ArrayList<Person> getPersons() {
		return persons;
	}

}
