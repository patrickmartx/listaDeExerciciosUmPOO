package br.com.patrickmartins.listaEx1.Q1;

import java.util.Scanner;

public class AppRaizEquacao {

	public static void main(String[] args) {
		RaizEquacao raiz = new RaizEquacao();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		float a = teclado.nextInt();
		System.out.print("Digite o valor de b: ");
		float b = teclado.nextInt();
		System.out.print("Digite o valor de c: ");
		float c = teclado.nextInt();
		System.out.println();
		raiz.descobre(a, b, c);
	}

}
