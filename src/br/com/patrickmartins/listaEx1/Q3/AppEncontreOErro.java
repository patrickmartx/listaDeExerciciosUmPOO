package br.com.patrickmartins.listaEx1.Q3;

import java.util.Scanner;

public class AppEncontreOErro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2, distancia;

		System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
		x1 = teclado.nextFloat();
		y1 = teclado.nextFloat();
		x2 = teclado.nextFloat();
		y2 = teclado.nextFloat();

		 /*distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 1/2);
		  * Erro encontrado. A potência 1/2, ao se dividir, resulta em 0.5. Porém, o java está considerando essa divisão como divisão de inteiros, o que de fato é. Porém, a resposta também é dada em inteiro, só que arredondando para baixo, fazendo com que a potência seja 0.
		  * Abaixo, uma solução para o problema.
		  */
		distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		System.out.println("A distância é: " + distancia);
	}
}
