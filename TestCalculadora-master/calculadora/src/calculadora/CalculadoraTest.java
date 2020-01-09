package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		//double a,b;
		double resultado=calculadora.Suma(3, 2) ;
		double esperado_resultado=5;
		assertEquals(resultado, esperado_resultado, "resultado exitoso");
	}
	@Test
	public void testResta() {
		
		double resultado=calculadora.Resta(5, 2);
		double esperado_resultado=3;
		assertEquals(resultado, esperado_resultado);
	}
	
	@Test
	public void testMultiplicacion() {
		
		double resultado=calculadora.Multiplicacion(3, 3);
		double esperado_resultado=9;
		assertEquals(resultado, esperado_resultado);
	}
	@Test
	public void testDivision() {
		
		double resultado=calculadora.Division(10,2);
		double esperado_resultado=5;
		assertEquals(resultado, esperado_resultado);
	}

}
