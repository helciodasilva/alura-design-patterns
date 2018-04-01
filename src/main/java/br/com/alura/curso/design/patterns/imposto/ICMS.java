package br.com.alura.curso.design.patterns.imposto;

public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
