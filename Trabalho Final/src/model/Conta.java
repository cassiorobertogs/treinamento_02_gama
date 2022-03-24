package model;

public class Conta {
	private int numero;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

//fim construtores
//metodos específicos da class Conta
	public String toString () {
		return numero+ " - "+saldo;
		
	}

	public void deposita(double valor) {
		if(valor >0) {
			this.saldo += valor;
		}
		
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

//Fim dos metodos específicos da class Conta
//metodos Geters
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
//Fim dos metodos Geters
}// fim class
