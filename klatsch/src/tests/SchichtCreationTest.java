package tests;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import person.Aushilfe;
import person.Kollektivist;
import schicht.Abend;
import schicht.Schicht;

public class SchichtCreationTest {

	Schicht s1;
	Schicht s2;
	Schicht s3;
	
	Kollektivist p1;
	Kollektivist p2;
	Kollektivist p3;
	
	Aushilfe a1;
	Aushilfe a2;
	
	@Before
	public void setUp() {
		s1 = new Abend();
		
		p1 = new Kollektivist("Cem", "Pol");
		p2 = new Kollektivist("Raini", "Scha", "abcde123456789", new SimpleDateFormat("01/01/1900"), "AOK",
				"xyz0987654321", 1000);
		p3 = new Kollektivist("Steffi", "Effi", "ab123cde", new SimpleDateFormat("01/01/2000"), "TKK", "x123y", 12.3);
		
		a1 = new Aushilfe("A1", "A Name 1");
		a2 = new Aushilfe("A2", "A2 nachname AAAA");
	}
	
	
	@Test
	public void testAddPerson() {
		s1.execAddPerson(p1);
		s1.execAddPerson(p1);
	}
}
