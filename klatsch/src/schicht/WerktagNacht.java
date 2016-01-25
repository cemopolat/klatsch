package schicht;
/*dieses Schicht am werktagen von 20.00 - 02.00 Uhr Schicht
 * und arbeitet zwei personen*/

import personInterface.PersonVerwaltung;

public class WerktagNacht extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 2;
	private String beschreibung ="in der Woche von 20.00 Uhr bis 02.00 Uhr schicht";
	
	public WerktagNacht() {
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
