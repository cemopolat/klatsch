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
	public void schictrechner(String[] args){
		int [][] times = new int [2][2];
		double schichtdauer = 0;
		
		if (args.length == 2){
			times = myTime (args[0], args[1]);
			if (times[0][0]== 0 && times [0] [1]==0 && times [1] [0] == 0 && 
					times [1] [1] == 0){
				schichtdauer = 0;
			} else{
				schichtdauer = MyArbeitsTime(times);
				System.out.println("schict dauert" + schichtdauer + "Stunden");
			}
		}
			else {
				System.out.println("falsche eingabe bitte versuchen sie nochmal");
			}
		}
		
		

	
	private double MyArbeitsTime(int[][] times) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int[][] myTime(String begin, String end){
		int[] [] Arbeitszeit = new int [2] [2];
		
		String[] ergebnis1 = begin.split(":");
		String[] ergebnis2 = end.split(":");
		
		int begin1 = Integer.valueOf(ergebnis1[0]). intValue();
		int begin2 = Integer.valueOf(ergebnis1[1]). intValue();
		int end1 = Integer.valueOf(ergebnis2[0]). intValue();
		int end2 = Integer.valueOf(ergebnis2[1]). intValue();
		
		Arbeitszeit[0][0] = begin1;
		Arbeitszeit[0][1] = begin2;
		Arbeitszeit[0][0] = end1;
		Arbeitszeit[0][1] = end2;
		
		return Arbeitszeit;
		
	}
	public static void MyArbeitsTime1(int[] [] Arbeitszeit){
		boolean nachtschicht;
		
		int zahl1 = (Arbeitszeit [0] [0] * 60) + Arbeitszeit [0] [1];
		int zahl2 = (Arbeitszeit [1] [0] * 60) + Arbeitszeit [1] [1];
		
		int zErg = 0;
		zErg = zahl1 <= zahl2? zahl2 - zahl1 : ((24*60)-zahl1)+ zahl2;
		nachtschicht = zahl1 <= zahl2 ? false : true;
		
		
		
	}


	public abstract String getBeschreibung();
}
