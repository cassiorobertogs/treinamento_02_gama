/*
 * Escreva a classe Relógio, com os atributos hora, minuto e segundo, e com um construtor que recebe horas, minutos e segundos para inicializar o relógio.
Faça um método da classe para exibir a hora atual. Crie os getters e setters para os atributos.
Faça um programa (main) que crie um objeto do tipo Relógio e exiba a hora atual do relógio.
O relógio não pode aceitar valores inválidos, ou seja, a hora deve estar entre 0 e 23, o minuto e o segundo devem estar entre 0 e 59.
 */

public class Ex02Relogio {

	private int hora;
	private int minuto;
	private int segundo;

	public Ex02Relogio(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
		
	}// fim contrutor

	public void mostrHora() {
		System.out.println("A hora atual é: " + hora + ":" + minuto + ":" + segundo);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora < 24)
			this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59)
			this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59)
			this.segundo = segundo;
	}
}// fim class
