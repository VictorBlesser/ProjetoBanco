import java.util.Scanner;



public class Main
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		private double saldo = 1000;
		int opcao;

		do {
			System.out.println("1 - Ver saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");

			System.out.println("Escolha:");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Saldo atual:" + saldo);
			} else if (opcao == 2) {
				System.out.println("Digite um valor de deposito");
				double deposito = sc.nextDouble();
				saldo += deposito;
				System.out.println("Deposito realizado");
			} else if (opcao == 3) {
				System.out.println("Digite o valor de saque:");
				double saque = sc.nextDouble();
				if (saque <= saldo) {
					saldo -= saque;
					System.out.println("Saque realizado");
				}
				else {
					System.out.println("Saldo insuficiente!");

				}
			}
			else if (opcao == 4) {
				System.out.println("saindo");
			}
			else {
				System.out.println("Opcao invalida");

			}
		} while (opcao != 4);
		sc.close();
	}
}
