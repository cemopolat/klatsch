package tests;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import person.Aushilfe;
import person.Kollektivist;

public class PersonCreationTest {

	Kollektivist p1;
	Kollektivist p2;
	Kollektivist p3;
	
	Aushilfe a1;
	Aushilfe a2;

	@Before
	public void setUp() {
		p1 = new Kollektivist("Cem", "Pol");
		p2 = new Kollektivist("Raini", "Scha", "abcde123456789", new SimpleDateFormat("01/01/1900"), "AOK",
				"xyz0987654321", 1000);
		p3 = new Kollektivist("Steffi", "Effi", "ab123cde", new SimpleDateFormat("01/01/2000"), "TKK", "x123y", 12.3);
		
		a1 = new Aushilfe("A1", "A Name 1");
		a2 = new Aushilfe("A2", "A2 nachname AAAA");
	}
	
	@Test
	public void testPersonCreationGetters() {
		assertEquals("Cem", p1.getVorname());
		assertEquals("Pol", p1.getNachname());
		assertEquals(new SimpleDateFormat("01/01/1900"), p2.getGeburtsdatum());
		
		assertEquals("A Name 1", a1.getNachname());
		assertEquals("A2", a2.getVorname());
		
		
		
	}
	
	@Test
	public void testPersonCreationSetters() {
		p2.setKrankenkasse("ABC");
		assertEquals("ABC", p2.getKrankenkasse());
	}
}
