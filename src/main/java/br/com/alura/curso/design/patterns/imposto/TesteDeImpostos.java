package br.com.alura.curso.design.patterns.imposto;

public class TesteDeImpostos {

	public static void main(String[] args) {
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
	
}
