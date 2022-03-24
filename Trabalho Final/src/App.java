import java.util.Scanner;

import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;
import util.GerenciaContas;

public class App {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		GerenciaContas contas = new GerenciaContas();
		int numeroDaConta;
		double limiteDaConta;
		Conta c;
		int digito = 0;
		String entradaDeTeclado;
		
		while (digito != 6) {
            System.out.println("1-Nova Conta");
            System.out.println("2-Procurar Conta pelo numero");
            System.out.println("3-Apagar Conta");
            System.out.println("4-Sacar");
            System.out.println("5-Depositar");
            System.out.println("6-Sair");
            System.out.print("Sua opção: ");
            entradaDeTeclado = teclado.nextLine();
            digito = Integer.parseInt(entradaDeTeclado);

            switch (digito) {
                case 1:
                    System.out.println("Digite o numero da nova conta:");
                    entradaDeTeclado = teclado.nextLine();
                    numeroDaConta = Integer.parseInt(entradaDeTeclado);
                    System.out.println("Qual o tipo da conta?");
                    System.out.println("1-Conta Corrente");
                    System.out.println("2-Conta Especial");
                    entradaDeTeclado = teclado.nextLine();
                    digito = Integer.parseInt(entradaDeTeclado);
                    while (digito == 2 || digito ==1) {
                    	switch (digito){
                    		case 1:
                    			c = new ContaCorrente(numeroDaConta, 0);
                                contas.adicionarConta(c);
                                System.out.println("Conta de numero: "+numeroDaConta+" criada com sucesso!");
                                break;	
                    		case 2:
                    			System.out.println("Quanto de limite terá essa Conta Especial:");
                    			entradaDeTeclado = teclado.nextLine();
                    			digito = Integer.parseInt(entradaDeTeclado);
                    			c = new ContaEspecial(numeroDaConta, 0, digito);
                                contas.adicionarConta(c);
                                System.out.println("Conta de numero: "+numeroDaConta+" criada com sucesso!");
                                break;
                    		default:
                                System.out.println("Opção inválida");
                                break;
                    	}
                    }
                    break;
                case 2:
                    System.out.println("Digite o numero da Conta que deseja procurar:");
                    entradaDeTeclado = teclado.nextLine();
                    digito = Integer.parseInt(entradaDeTeclado);
                    System.out.println(contas.exibir(digito));
                    break;
                case 3:
                	System.out.println("Digite o numero da conta que deseja apagar:");
                    entradaDeTeclado = teclado.nextLine();
                    digito = Integer.parseInt(entradaDeTeclado);
                    boolean removeu = contas.remover(digito);
                    if(removeu) {
                        System.out.println("Removido com sucesso");
                    } else {
                        System.out.println("Não foi possível remover");
                    }
                    break;
                case 4:
                	System.out.println("Digite o numero Conta de onde sairá o valor:");
                    entradaDeTeclado = teclado.nextLine();
                    numeroDaConta = Integer.parseInt(entradaDeTeclado);
                    System.out.println("Qual o valor do saque:");
                    entradaDeTeclado = teclado.nextLine();
                    digito = Integer.parseInt(entradaDeTeclado);
                    contas.sacarDasContas(numeroDaConta, digito);
                case 5:
                	System.out.println("Digite o numero Conta Destino:");
                    entradaDeTeclado = teclado.nextLine();
                    numeroDaConta = Integer.parseInt(entradaDeTeclado);
                    System.out.println("Digite valor do depósito:");
                    entradaDeTeclado = teclado.nextLine();
                    digito = Integer.parseInt(entradaDeTeclado);
                    contas.depositaNasContas(numeroDaConta, digito);
                case 6:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        teclado.close();
    }
}


