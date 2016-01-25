package schicht;
/*dieses Schicht von Dienstag bis Donnerstag von 18.00 - 22.00 Uhr Schicht
 * und arbeitet nur ein person und 
 * dieses schicht wird nur im sommer als unterst�tzungskraft eingesetzt
 */

import personInterface.PersonVerwaltung;

public class SommerAbend extends Schicht {
	
	private double schichtdauer = 4;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "nur im Sommer von 18.00 Uhr bis 22.00 Uhr Schicht";


	public SommerAbend() {
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
