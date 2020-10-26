package br.com.alura.curso.design.patterns.imposto;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto issComIcms = new ISSComICMS();

		Orcamento orcamento = new Orcamento(500.0);

		double valor = issComIcms.calcula(orcamento);

		System.out.println(valor);
	}

}
