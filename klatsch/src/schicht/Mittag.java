package schicht;

import personInterface.PersonVerwaltung;

public class Mittag extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 1;
	private String beschriftung = "in der woche von 12.00 Uhr bis 18.00 Uhr schicht";
	
	public Mittag() {
		personVerwaltung = new PersonVerwaltung(besatzung);
	}
	
	@Override
	public String getBeschreibung() {
		return beschriftung;
	}
	@Override
	public double getSchichtdauer() {
		return schichtdauer;
	}

}
