package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.Calculadora;

public class CalculadoraTest {

	private Calculadora c;

	@BeforeEach
	public void setup() {
		c = new Calculadora();
	}

	@Test
	public void deveRetornarASomaDosValores() {
		c = new Calculadora();

		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}

	@Test
	public void deveRetornarSubtracao() {
		c = new Calculadora();

		double resultado = c.subtrair(50, 20);
		assertEquals(30, resultado);
	}

	@Test
	public void deveRetornarMultiplicacao() {
		c = new Calculadora();

		double resultado = c.multiplicacao(9, 5);
		assertEquals(45, resultado);
	}

	@Test
	public void deveRetornarDivisaoQuandoDenominadorDiferenteDeZero() {
		c = new Calculadora();

		double resultado = c.divisao(15, 3);
		assertEquals(5, resultado);
	}
@Test
public void deveRetornarNegativoQuandoZero() {
	c = new Calculadora();

	double resultado = c.divisao(11, 3);
	assertEquals(0, resultado);
	
}

}
