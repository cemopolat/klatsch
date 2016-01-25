package schicht;
/*dieses Schicht am  Freitag  und Samstag Nacht von 20.00 - 02.00 Uhr Schicht
 * und arbeitet drei personen
 */

import personInterface.PersonVerwaltung;

public class WENacht extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 3;
	private String beschreibung = "freitag und Samstag von 20.00 Uhr bis 02.00 Uhr Schicht";
	
	public WENacht() {
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
