package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 15.00 - 20.00 Uhr Schicht
 * und arbeitet nur ein person*/

import personInterface.PersonVerwaltung;

public class NachMittag extends Schicht {

	private double schichtdauer = -1;
	private double schichtPause = -1;
	private int besatzung = -1;
	private String beschreibung = "!!! Beschreibung faehlt !!!";
	
	public NachMittag() {
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
