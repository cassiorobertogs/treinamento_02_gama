
public class Colaborador extends Pessoa{
	private String cargo;
	private double salario;
	private int tempoDeCasa;
	private int horasTrabalhadas;
	private double valorDaHora;
	
	public Colaborador(String nome, int idade, char sexo, String cargo, double salario, int tempoDeCasa, int horasTrabalhadas, 
			double valorDaHora) {
		super(nome, idade, sexo);
		this.cargo = cargo;
		this.salario = salario;
		if(tempoDeCasa > 0) {
			this.tempoDeCasa = tempoDeCasa;	
		}
		if(horasTrabalhadas > 0 && horasTrabalhadas < 40) {
			this.horasTrabalhadas = horasTrabalhadas;
		}
		this.valorDaHora = valorDaHora;
	}

	public void calculaSalario() {
		this.salario = horasTrabalhadas * valorDaHora;
	}
	
	public void mostraColaborador() {
		mostraPessoa();System.out.println("atualmente possui o cargo de: "+cargo+" com remuneração base de "+salario+" e já trabalha aqui há "+tempoDeCasa+" anos.");
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTempoDeCasa() {
		return tempoDeCasa;
	}

	public void setTempoDeCasa(int tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
}//fim class
