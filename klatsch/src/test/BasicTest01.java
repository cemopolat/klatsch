package test;

import person.Kolektivist;
import person.Person;
import schicht.Abend;
import schicht.Schicht;

public class BasicTest01 {
	
	public static void main(String[] args) {
		
		Person p1 = new Kolektivist("Cemo", "Polat");
		Person p2 = new Kolektivist("Reiner", "Schambach");
		Schicht s1 = new Abend();
		
		System.out.println(s1.getRawPersons().size());
		
		s1.addPerson(p1);
		s1.addPerson(p2);
		
		System.out.println(s1.getPersonsAsAList());
		System.out.println(s1.getRawPersons().size());
		
		System.out.println(s1.getBeschreibung());
		
		s1.removePerson(p1);
		
		System.out.println(s1.getPersonsAsAList());
		System.out.println(s1.getRawPersons().size());
	}
}
