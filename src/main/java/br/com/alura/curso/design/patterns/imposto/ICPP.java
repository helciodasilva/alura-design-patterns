package br.com.alura.curso.design.patterns.imposto;

class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP() {
	}

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}