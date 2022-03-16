import java.util.Scanner;

/*
 *Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência de números de 1 até o valor digitado pelo usuário. 
Por exemplo, se o usuário digitar o número 8, o programa deve mostrar
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;

		System.out.println("Digite um valor");
		valor = teclado.nextInt();

		for (int i = 0; i <= valor; i++) {
			System.out.println(i);
		}
		teclado.close();
	}
}
