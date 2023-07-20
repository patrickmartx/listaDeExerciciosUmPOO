package br.com.patrickmartins.listaEx1.Q17;

public class DecimalParaRomano {
	
	String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	String[] dezenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	

	String resultado(int numero) {
		String convertido = "";
		
		switch (Integer.toString(numero).length()) {
		case 1:
			convertido = unidadesRomanas[numero];
			break;
		case 2:
			convertido = dezenasRomanas[numero/10] + unidadesRomanas[numero%10]; 
			break;
		case 3:
			convertido = centenasRomanas[numero/100] + dezenasRomanas[(numero % 100) / 10] + unidadesRomanas[numero%10];
			break;
		}

		return convertido;
	}
}
