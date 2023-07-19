package br.com.patrickmartins.listaEx1.Q1;

public class RaizEquacao {
	
	void descobre(float a, float b, float c) {
		
		float delta = (float)(Math.pow(b, 2) - 4 * a * c);
		float raiz1 = (float)(((b*-1) + Math.sqrt(delta))/2);
		float raiz2 = (float)(((b*-1) - Math.sqrt(delta))/2);
		
		System.out.printf("As raizes da equação %dx² + %dx + %d = 0 tem como resultado:"
				+ "\nRaiz 1: %f"
				+ "\nRaiz 2: %f", (int)a, (int)b, (int)c, raiz1, raiz2 );
	}
}
