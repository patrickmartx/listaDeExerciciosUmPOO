package br.com.patrickmartins.listaEx1.Q6;

import java.util.Scanner;

public class AppNumeroDeDigitos {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidadeDeCaracteres = 0;
		
		System.out.print("Escreva um número: ");
		int numero = teclado.nextInt();
		for (int i = 0; i < Integer.toString(numero).length(); i++) {
			quantidadeDeCaracteres++;
		}
		
		System.out.printf("Quantidade de caracteres: %d", quantidadeDeCaracteres);
	}

}
