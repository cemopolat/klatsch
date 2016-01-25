package schicht;
/*dieses Schicht am wochenenden von 08.00 - 14.00 Uhr Schicht
 * und arbeitet drei person
 * 
 */

import personInterface.PersonVerwaltung;

public class WEFruh1 extends Schicht{
	
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 3;
	private String beschreibung = "am wochenende Branch Schicht von 08.00 - 14.00 Uhr Schicht";
	
	public WEFruh1() {
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
