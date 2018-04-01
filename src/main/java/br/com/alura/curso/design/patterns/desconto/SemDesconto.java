package br.com.alura.curso.design.patterns.desconto;

import br.com.alura.curso.design.patterns.imposto.Orcamento;

public class SemDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto desconto) {
		// nao tem!
	}

}
