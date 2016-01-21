package tests;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import person.Kolektivist;

public class PersonCreationTest {

	Kolektivist p1;
	Kolektivist p2;
	Kolektivist p3;

	@Before
	public void setUp() {
		p1 = new Kolektivist("Cem", "Pol");
		p2 = new Kolektivist("Raini", "Scha", "abcde123456789", new SimpleDateFormat("01/01/1900"), "AOK",
				"xyz0987654321", 1000);
		p3 = new Kolektivist("Steffi", "Effi", "ab123cde", new SimpleDateFormat("01/01/2000"), "TKK", "x123y", 12.3);
	}
	
	@Test
	public void testPersonCreationGetters() {
		assertEquals("Cem", p1.getVorname());
		assertEquals("Pol", p1.getNachname());
		assertEquals(new SimpleDateFormat("01/01/1900"), p2.getGeburtsdatum());
		
	}
	
	@Test
	public void testPersonCreationSetters() {
		p2.setKrankenkasse("ABC");
		assertEquals("ABC", p2.getKrankenkasse());
	}
}
