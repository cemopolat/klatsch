package schicht;
import personInterface.PersonVerwaltung;

public class WEMittag3 extends Schicht {
	
	private double schichtdauer = 6;
	private double schichtpause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "nur am Sonntag von 12.00 Uhr bis 18.00 Uhr ab 11.00 Uhr bereitschaft";

	public WEMittag3() {
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
