package br.com.patrickmartins.listaEx1.Q10;

import java.util.Scanner;

public class AppInvestimentoFinanceiro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CalculoInvestimentoFinanceiro CIF = new CalculoInvestimentoFinanceiro();
		
		int ano = 1;
		double saldo = 0.0;
		
		System.out.print("Quanto deve ser investido por mês?\n> R$");
		double investimentoPorMes = teclado.nextDouble();
		System.out.print("Qual é a taxa de juros mensais?\n> ");
		double taxaDeJuros = teclado.nextInt();

		teclado.nextLine(); //Limpar o buffer
 		String opcao = "S";
			while (!opcao.equalsIgnoreCase("N")) {
				if (opcao.equalsIgnoreCase("S")){
					saldo+= CIF.saldoInvestimento(investimentoPorMes, taxaDeJuros);
					System.out.printf("Saldo após %d %s: R$%.2f\n", ano, (ano == 1) ? "ano" : "anos", saldo);
					ano++;
					System.out.println();
					System.out.print("Deseja processar mais um ano? (S/N)\n> ");
					opcao = teclado.nextLine();
				} else {
					System.out.println("Opção inválida!");
					System.out.print("Deseja processar mais um ano? (S/N)\n> ");
					opcao = teclado.nextLine();
				}
			}
			System.out.println("Encerrando programa.");
	}

}
