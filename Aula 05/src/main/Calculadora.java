package main;

public class Calculadora {

	public Object mod;

	public double somar(double n1, double n2) {
		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public double multiplicacao(double n1, double n2) {
		return n1 * n2;
	}

	public double divisao(double n1, double n2) {
		
		if (n2 == 0) {
			return -1;
		}
		return n1 / n2;
		
	}

}
