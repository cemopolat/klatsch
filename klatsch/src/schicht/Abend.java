package schicht;

import personInterface.PersonVerwaltung;

public class Abend extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 1;
	
	private String beschreibung = "Abend Schicht unter der Woche von 18 Uhr bis 24 Uhr";

	public Abend() {
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
