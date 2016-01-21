package schicht;
/*dieses Schicht i der Woche von 18.00 - 24.00 Uhr Schicht
 * und arbeitet nur ein person*/

import personInterface.AddOnePerson;

public class Abend extends Schicht {

	public Abend() {
		personInterface = new AddOnePerson();
	}
	

	
	private double schichtdauer = 6;
	private double schichtPause = 0.5;
	private int besatzung = 1;
	private String beschreibung = "Abend Schicht unter der Woche von 18 Uhr bis 24 Uhr";

	@Override
	public String getBeschreibung() {
		return beschreibung;
	}
}
