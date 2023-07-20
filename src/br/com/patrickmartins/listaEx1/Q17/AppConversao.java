package br.com.patrickmartins.listaEx1.Q17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppConversao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalParaRomano converteDecimal = new DecimalParaRomano();
		try {
			System.out.print("Escreva um número com no máximo 3 dígitos\n> ");
			int numero = teclado.nextInt();
			while (Integer.toString(Math.abs(numero)).length() > 3) {
				System.err.println("Valor não disponível!");
				System.out.print("Escreva um número com no máximo 3 dígitos\n> ");
				numero = teclado.nextInt();
			}
			
			String emRomano = converteDecimal.resultado((Math.abs(numero)));
			System.out.println();
			System.out.printf("O numero %d em romano se torna: %s.", numero, (numero > 0) ? emRomano: "-"+emRomano);
		}
		catch (InputMismatchException e) {
			System.err.println("Erro encontrado: " + e);
			System.out.println("O programa será encerrado.");
		}	
	}
}
