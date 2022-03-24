package model;


public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	@Override
	public void saca(double valor) {
		double limiteDeSaque = getSaldo() + this.limite;
		if (valor <= limiteDeSaque) {
			super.saca(valor);
		} else {
			System.out.println("Limite indisponível na conta Especial");
		}
	}
}
