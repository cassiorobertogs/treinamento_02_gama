
public class PlacarApp {
	public static void main(String[] args) {

		Placar CorinthiansXFlamengo = new Placar();
		Placar SaoPauloXCorinthias = new Placar("São Paulo", "Corinthians");
		Placar GremioXCorinthias = new Placar("Grêmio", "Corinthians", 2, 3);
		
		CorinthiansXFlamengo.mostrPlacar();
		SaoPauloXCorinthias.mostrPlacar();
		GremioXCorinthias.mostrPlacar();
		
	}//fim meain
}//fim class
