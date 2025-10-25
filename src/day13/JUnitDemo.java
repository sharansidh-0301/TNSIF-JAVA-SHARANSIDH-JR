package day13;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitDemo {
		
	@BeforeEach
	void display()
	{
		System.out.println("Testing Started.....");
	}
	@AfterEach
	void display1() {
		System.out.print("Testing Completed...");
	}
	
	@Test
	void testAdditioin() {
		Calculator cal = new Calculator();
		int result = cal.add(7, 3);
		assertEquals(10,result,"Addition Should Return correct Sum.");
	}

}
