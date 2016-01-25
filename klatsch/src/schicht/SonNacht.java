package schicht;

import personInterface.PersonVerwaltung;

public class SonNacht extends Schicht {
	
	private double schichtdauer = -1;
	private double schichtPause = -1;
	private int besatzung = -1;
	private String beschreibung = "!!! Beschreibung faehlt !!!";

	public SonNacht() {
		personVerwaltung = new PersonVerwaltung(besatzung); 	
	}

	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	@Override
	public double getSchichtdauer() {
		return besatzung;
	}

}
