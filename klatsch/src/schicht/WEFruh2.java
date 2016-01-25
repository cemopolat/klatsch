package schicht;
/*dieses Schicht am wochenende von 10.00 - 16.00 Uhr Schicht
 * und arbeitet nur ein person*/

import personInterface.PersonVerwaltung;

public class WEFruh2 extends Schicht {

	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "am wochenende von 10.00 Uhr bis 16.00 Uhr Schicht";

	public WEFruh2() {
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
