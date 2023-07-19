package br.com.patrickmartins.listaEx1.Q2;

import java.util.Scanner;

public class AppCalculaDistancia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		float[] x = new float[2];
		float[] y = new float[2];
		float[] z = new float[2];
		
		System.out.print("Digite os valores de x1 e x2 separados por espaço:\n> ");
		x[0] = teclado.nextFloat();
		x[1] = teclado.nextFloat();
		
		System.out.print("Digite os valores de y1 e y2 separados por espaço:\n> ");
		y[0] = teclado.nextFloat();
		y[1] = teclado.nextFloat();
		
		System.out.print("Digite os valores de z1 e z2 separados por espaço:\n> ");
		z[0] = teclado.nextFloat();
		z[1] = teclado.nextFloat();
		
		System.out.println();
		
		double distancia = Math.sqrt(
									Math.pow(x[0] - x[1], 2) + 
									Math.pow(y[0] - y[1], 2) + 
											Math.pow(z[0] - z[1], 2)
											);
		
		System.out.printf("A distância entre (%.1f, %.1f), (%.1f, %.1f) e (%.1f, %.1f) é de %.1f", x[0], x[1], y[0], y[1], z[0], z[1], distancia);
	}

}
