package schicht;

import personInterface.AddOnePerson;

public class FAbend extends Schicht{

	private String beschreibung = "";
	
	public FAbend() {
		personInterface = new AddOnePerson();
	}
	
	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return null;
	}
}
