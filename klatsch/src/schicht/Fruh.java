package schicht;

import personInterface.PersonVerwaltung; 

public class Fruh extends Schicht {

	private double schichtdauer = 5.5;
	private double schichtPause = 0.5;
	private int besatzung = 2;
	private String beschreibung = "in der woche von 10.30 Uhr bis 15.00 Uhr Schicht";
	
	public Fruh() {
		personVerwaltung = new PersonVerwaltung(besatzung);
	}
	
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	@Override
	public double getSchichtdauer() {
		return schichtdauer;
	}
}
