import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculoPartIITest {
	
	Calculo calc;

	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculo();
	}

	@After
	public void after() {
		System.out.println("after()");
		calc.cls();
	}

	@Test
	public void testPotenciacion() {
		System.out.println("potenciacion()");
		Calculo calc = new Calculo();
		int total = calc.potenciacion(2, 3);
		int esp = 8;
		assertEquals(esp, total);
	}
	
	@Test
	public void testPotenciacionFallida() {
		System.out.println("potenciacionFallo()");
		Calculo calc = new Calculo();
		int total = calc.potenciacion(3, 3);
		int esp = 9;
		assertNotSame(esp, total);
	}

	@Test
	public void testRaizCuadrada() {
		System.out.println("Raiz()");
		Calculo calc = new Calculo();
		int total = calc.raizCuadrada(25);
		int esp = 5;
		assertEquals(esp, total);
	}
	
	@Test
	public void testRaizCuadradaFallida() {
		System.out.println("RaizFallo()");
		Calculo calc = new Calculo();
		int total = calc.raizCuadrada(20);
		int esp = 5;
		assertNotSame(esp, total);
	}
		
}
