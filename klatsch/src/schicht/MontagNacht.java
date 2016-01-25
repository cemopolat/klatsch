package schicht;
/*dieses Schicht am Montag von 19.00 - 01.00 Uhr Schicht
 * und arbeitet nur zwei person*/

import personInterface.PersonVerwaltung;

public class MontagNacht extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 2;
	private String beschreibung = "nur am Montag Abend von 19.00 Uhr bis 01.00 Uhr Schicht";

	public MontagNacht() {
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
