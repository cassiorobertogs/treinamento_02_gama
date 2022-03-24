package util;

import java.util.ArrayList;

import model.Conta;

public class GerenciaContas {
	private ArrayList<Conta> contas;

	public GerenciaContas() {
		contas = new ArrayList<>();
	}

	public void adicionarConta(Conta c) {
		contas.add(c);
	}

	public String exibir(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			}
		}
		return "Conta não existente";
	}

	private int posicao(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return i;
			}
		}
		return -1;
	}

	public boolean remover(int numero) {
		int posicao = posicao(numero);
		if (posicao >= 0) {
			if (contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}

	public String sacarDasContas(int numero, double valor) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				contas.get(i).saca(valor);
				return "O saldo atual é " + contas.get(i).getSaldo();
			}
		}
		return "Saldo indisponível, tente sacar um valor menor";
	}
	public String depositaNasContas(int numero, double valor) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				contas.get(i).deposita(valor);
				return "O saldo atual é " + contas.get(i).getSaldo();
			}
		}
		return "o valor de: "+valor+" foi depositado";
	}

}
