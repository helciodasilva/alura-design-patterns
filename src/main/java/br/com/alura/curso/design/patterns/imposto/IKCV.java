package br.com.alura.curso.design.patterns.imposto;

import br.com.alura.curso.design.patterns.desconto.Item;

class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }
	
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}
}