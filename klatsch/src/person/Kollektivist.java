package person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import schicht.Schicht;

public class Kollektivist extends Person {

	private String versicherungsnummer;
	private SimpleDateFormat geburtsdatum;
	private String krankenkasse;
	private String steuernummer;
	private double angemeledetestunden;
	private double gearbeitetestunden;
	private SimpleDateFormat urlaubdatum;

	private ArrayList<Schicht> festeSchichten;

	// TODO for test only, remove it later !!! 
	public Kollektivist(String vorname, String nachname) {
		super(vorname, nachname);
	}

	/**
	 * @param vorname
	 * @param nachname
	 * @param versicherungsnummer
	 * @param geburtsdatum
	 * @param krankenkasse
	 * @param steuernummer
	 * @param angemeledetestunden
	 */
	public Kollektivist(String vorname, String nachname, String versicherungsnummer, SimpleDateFormat geburtsdatum,
			String krankenkasse, String steuernummer, double angemeledetestunden) {
		super(vorname, nachname);
		this.versicherungsnummer = versicherungsnummer;
		this.geburtsdatum = geburtsdatum;
		this.krankenkasse = krankenkasse;
		this.steuernummer = steuernummer;
		this.angemeledetestunden = angemeledetestunden;
	}

	public ArrayList<Schicht> getFesteSchichten() {
		return festeSchichten;
	}

	public String getVersicherungsnummer() {
		return versicherungsnummer;
	}

	public SimpleDateFormat getGeburtsdatum() {
		return geburtsdatum;
	}

	public String getKrankenkasse() {
		return krankenkasse;
	}

	public String getSteuernummer() {
		return steuernummer;
	}

	public double getAngemeledetestunden() {
		return angemeledetestunden;
	}

	public double getGearbeitetestunden() {
		return gearbeitetestunden;
	}

	public SimpleDateFormat getUrlaubdatum() {
		return urlaubdatum;
	}

	public void setFesteSchichten(Schicht schicht) {
		if (!festeSchichten.contains(schicht)) {
			// TODO implement method body !!!!
		}
	}

	public void setVersicherungsnummer(String versicherungsnummer) {
		this.versicherungsnummer = versicherungsnummer;
	}

	public void setGeburtsdatum(SimpleDateFormat geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public void setKrankenkasse(String krankenkasse) {
		this.krankenkasse = krankenkasse;
	}

	public void setSteuernummer(String steuernummer) {
		this.steuernummer = steuernummer;
	}

	public void setAngemeledetestunden(double angemeledetestunden) {
		this.angemeledetestunden = angemeledetestunden;
	}

	public void setGearbeitetestunden(double gearbeitetestunden) {
		this.gearbeitetestunden = gearbeitetestunden;
	}

	public void setUrlaubdatum(SimpleDateFormat urlaubdatum) {
		this.urlaubdatum = urlaubdatum;
	}
}
