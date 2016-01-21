package person;

import java.util.ArrayList;
import java.util.Date;

import schicht.Schicht;

public class Kolektivist implements Person {

	private String vorname;
	private String nachname;
	
	private ArrayList<Schicht> festeSchichten;
	
	public Kolektivist(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getVorname() {
		// TODO Auto-generated method stub
		return vorname;
	}

	@Override
	public String getNachname() {
		// TODO Auto-generated method stub
		return nachname;
	
	}

	@Override
	public String getVersicherungsnummer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getGeburtsdatum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKrankenkasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSteuernummer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAngemeledetestunden() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGearbeitetestunden() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getUrlaubdatum() {
		// TODO Auto-generated method stub
		return null;
	}

}
