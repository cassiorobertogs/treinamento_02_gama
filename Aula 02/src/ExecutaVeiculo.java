
public class ExecutaVeiculo {
	public static void main(String[] args) {
		Veiculo celta = new Veiculo("celta", "Chevrolet", 16.0);
		
		celta.mostraModeloEMarca();
		celta.mostraConsumo();
		System.out.println("e seu consumo é aproximadamente "+celta.mostraConsumo());
	}

}
