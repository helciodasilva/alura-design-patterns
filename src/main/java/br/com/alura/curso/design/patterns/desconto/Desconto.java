package br.com.alura.curso.design.patterns.desconto;

import br.com.alura.curso.design.patterns.imposto.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
	
}
