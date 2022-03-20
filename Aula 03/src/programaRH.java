
public class programaRH {
	public static void main(String[] args) {

		Colaborador c1 = new Colaborador("Marcos", 56, 'm', "Gerente Adm.", 12.000, 6, 40, 180);
		ColaboradorSenior d1 = new ColaboradorSenior("Luciana", 33, 'f', "Gerente Adm.", 12.000, 6, 40, 180, 200.0,
				9000.0);

		c1.mostraColaborador();
		d1.mostraColaboradorSenior();

	}// fim main
}// fim class
