
public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;
	
	public Veiculo(String modelo, String marca, double consumo) {
		this.modelo = modelo;
		this.marca = marca;
		this.consumo = consumo;
	}//fim construtor
	
	public void mostraModeloEMarca() {
		System.out.println("O modelo do Carro é: "+this.modelo+" da marca "+this.marca);
	}
	public double mostraConsumo() {
		return this.consumo;
	}
	public void setConsumo(double consumo) {
		if (consumo >= 0) {
			this.consumo = consumo;
		}
	}
}	
