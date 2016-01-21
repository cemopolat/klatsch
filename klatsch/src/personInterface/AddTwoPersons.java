package personInterface;

import java.util.ArrayList;

import person.Person;

public class AddTwoPersons implements PersonInterface {

	private ArrayList<Person> persons = new ArrayList<>(2);
	private boolean isBesetzt = false;
	
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
		// TODO Auto-generated method stub
		return persons;
	}
}
