package schicht;

import personInterface.PersonVerwaltung;

public class FMittag extends Schicht {
	
	private String beschreibung = "";
	private double schichtdauer = 4.5;
	private int besatzung = 1;

	public FMittag() {
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
