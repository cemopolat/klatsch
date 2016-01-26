package schicht;

import java.util.ArrayList;

import person.Person;
import personInterface.PersonVerwaltung;

public abstract class Schicht {
	
	PersonVerwaltung personVerwaltung;
	
	static final short LOHN = -1; 
	
	/**
	 * @return all persons in the shift as ArraList
	 */
	public ArrayList<Person> getPersonsArrayList() {
		return personVerwaltung.getPersons();
	}
	
	/**
	 * Adds Person to list
	 * @param p Person to add
	 */
	public void execAddPerson(Person p) {
		personVerwaltung.addPerson(p);
	}

	/**
	 * Remove Person from the list 
	 * @param p
	 */
	public void execRemovePerson(Person p) {
		if (getPersonsArrayList().contains(p)) {
			getPersonsArrayList().remove(p);
		} else {
			System.out.println("Person not found !!!");
		}
	}
	
	/**
	 * Replace perons1 with person2 in the shift
	 * @param p1 Person to replace to
	 * @param p2 Person to replace with
	 */
	public void execReplacePerson(Person p1, Person p2) {
		if (getPersonsArrayList().contains(p1)) {
			getPersonsArrayList().remove(p1);
			execAddPerson(p2);
		} else {
			System.out.println("Person not found !!!");
		}
	}
	
	/**
	 * @return true if shift is full
	 */
	public boolean getIsShiftFull() {
		return personVerwaltung.getIsShiftFull();
	}
	
	/**
	 * @return formated string with all persons in the shift
	 * "Nachname(a) Vorname(a), Nachname(b) Vorname(b), ... , Nachname(n) Vorname(n) \n"
	 */
	public String getPersonsAsFormatedList() {
		StringBuilder sb = new StringBuilder(10);
		
		for (int i = 0; i < getPersonsArrayList().size(); i++) {
			if (!(i == getPersonsArrayList().size() - 1)) {
				sb.append(getPersonsArrayList().get(i).getNachname() + " " + getPersonsArrayList().get(i).getVorname() + ", ");
			} else 
				sb.append(getPersonsArrayList().get(i).getNachname() + " " + getPersonsArrayList().get(i).getVorname() + "\n");
		}		
		return sb.toString();		
	}
	
	/**
	 * @return description of the shift
	 */
	public abstract String getBeschreibung();
	
	/**
	 * @return duration of the shift in hours  
	 */
	public abstract double getSchichtdauer();
	
}
