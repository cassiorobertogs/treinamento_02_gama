import java.util.Scanner;

/*
 * A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.
 */
public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double salario, percentual, prestacao;

		System.out.println("Quanto você grnha?");
		salario = teclado.nextDouble();

		System.out.println("De quanto será a prestação?");
		prestacao = teclado.nextDouble();

		percentual = (salario * 30) / 100;

		if (prestacao >= percentual) {
			System.out.println("Seu impréestimo não foi aprovado");
		} else
			System.out.println("Seu impréestimo foii aprovado");

		teclado.close();
	}
}
