package model;


public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}
	@Override
	public void saca(double valor) {
		if (valor <= getSaldo()) {
			super.saca(valor);
		}else {
			System.out.println("Saldo insuficiente na conta Corrente");
		}
	}

}// fim class
