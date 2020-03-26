
public class Calculo {
	
	private int resp;

	public void Calculadora(){		
		resp = 0;		
	}	
	
	public int suma(int a, int b)
	{
		
		resp = a + b;
		return resp;
		
	}
	
	public int resta(int a, int b)
	{
		
		resp = a - b;
		return resp;
	}
	
	public int multiplicacion(int a, int b)
	{
		
		resp = a * b;
		return resp;
	}
	
	public int division(int a, int b)
	{
		
		resp = a / b;
		return resp;
	}
	
	public int potenciacion(int a, int b)
	{
		
		resp = (int) Math.pow(a, b);
		return resp;
	}	
	
	public int raizCuadrada(int a)
	{
		
		resp = (int) Math.sqrt(a);
		return resp;
	}
	
	public void cls(){		
		resp = 0;		
	}
		
}
