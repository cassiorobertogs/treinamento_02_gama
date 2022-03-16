import java.util.Scanner;

/*
 * Escreva um programa que exiba a tabuada do número digitado pelo usuário.
   Por exemplo, se o usuário digitar o valor 5, deve mostrar a tabuada no número 5, como está listado abaixo.
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, resultado;

		System.out.println("Digite um número para cer cauculado");
		numero = teclado.nextInt();

		for (int i = 0; i <= 10; i++) {
			if (i == 0)
				i++;
			resultado = i * numero;
			System.out.println(numero + " x " + i + " é: " + resultado);
		}
		teclado.close();
	}

}
