import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculoTest {

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
	public void testSuma() {
		System.out.println("suma()");
		Calculo calc = new Calculo();
		int total = calc.suma(10, 25);
		int esp = 35;
		assertEquals(esp, total);

	}

	@Test
	
	  public void testSumaFallida() { 
	  System.out.println("sumaFallida()");
		Calculo calc = new Calculo();
		int total = calc.suma(10, 25);
		int esp = 15;
		assertNotSame(esp, total);	 
	  }
	 

	@Test
	public void testResta() {
		System.out.println("resta()");
		Calculo calc = new Calculo();
		int total = calc.resta(25, 10);
		int esp = 15;
		assertEquals(esp, total);
	}

	
	  @Test 
	  public void testRestaFallida() { 
		  System.out.println("restaFallida()");
			Calculo calc = new Calculo();
			int total = calc.resta(15, 10);
			int esp = 25;
			assertNotSame(esp, total);
	  }
	 

	@Test
	public void testMultiplicacion() {
		System.out.println("multiplicacion()");
		Calculo calc = new Calculo();
		int total = calc.multiplicacion(3, 5);
		int esp = 15;
		assertEquals(esp, total);
	}
	
	@Test
	public void testMultiplicacionFallida() {
		System.out.println("multiplicacionFallo()");
		Calculo calc = new Calculo();
		int total = calc.multiplicacion(3, 2);
		int esp = 15;
		assertNotSame(esp, total);
	}

	
	@Test
	public void testDivision() {
		System.out.println("division()");
		Calculo calc = new Calculo();
		int total = calc.division(20, 5);
		int esp = 4;
		assertEquals(esp, total);
	}
	
	@Test
	public void testDivisionFallida() {
		System.out.println("divisionFallo()");
		Calculo calc = new Calculo();
		int total = calc.division(15, 5);
		int esp = 4;
		assertNotSame(esp, total);
	}	
	
	@Test(expected=Exception.class)
	public void exceptionTest() throws Exception{
		
		throw new Exception("Prueba de excepcion de Cuervo");
		
	}	
		
}
