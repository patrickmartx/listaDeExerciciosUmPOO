package br.com.patrickmartins.listaEx1.Q10;

public class CalculoInvestimentoFinanceiro {
	
	double saldoInvestimento(double investimentoPorMes, double taxaDeJuros) {
		int mes = 1;
		double saldo = 0.0;
		while(mes <= 12) {
			saldo+= investimentoPorMes;
			saldo*= 1 + (taxaDeJuros * 1/100);
			mes++;
		}
		return saldo;
		
	}
	
}
