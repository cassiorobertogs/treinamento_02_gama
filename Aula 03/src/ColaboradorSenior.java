
public class ColaboradorSenior extends Colaborador {
	private double bonus;
	private double salarioSenior;
	
	public ColaboradorSenior(String nome, int idade, char sexo, String cargo, double salario, int tempoDeCasa,
			int horasTrabalhadas, double valorDaHora, double bonus, double salarioSenior) {
		super(nome, idade, sexo, cargo, salario, tempoDeCasa, horasTrabalhadas, valorDaHora);
		this.bonus = bonus;
		this.salarioSenior = salarioSenior;
	}
	public void mostraColaboradorSenior() {
		mostraColaborador();System.out.print(", se trata de um colaborador Senior, seu bonus é de "+bonus+"logo seu salário base é "+salarioSenior
				+" e seu salário total é de: ");calculaSalarioSenior();
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void calculaSalarioSenior() {
		salarioSenior += (getSalario() * 10) / getHorasTrabalhadas();  
	}
}//fim da clas
