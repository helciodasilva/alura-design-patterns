package br.com.alura.curso.design.patterns.conta;

interface Resposta {
	void responde(Requisicao req, Conta conta);
}

class RespostaEmXml implements Resposta {
	private Resposta outraResposta;

	public RespostaEmXml(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}

}

class RespostaEmCsv implements Resposta {
	private Resposta outraResposta;

	public RespostaEmCsv(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}
}

class RespostaEmPorcento implements Resposta {
	private Resposta outraResposta;

	public RespostaEmPorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}
}