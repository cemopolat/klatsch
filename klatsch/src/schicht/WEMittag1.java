package schicht;
/*dieses Schicht am Wochenende von 14.00 - 20.00 Uhr Schicht
 * und arbeitet nur zwei person*/

import personInterface.PersonVerwaltung;

public class WEMittag1 extends Schicht {

	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "am wochenende (Samstag und sonntag) von 14.00 Uhr bis 20.00 Uhr Schicht";
	
	public WEMittag1() {
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
