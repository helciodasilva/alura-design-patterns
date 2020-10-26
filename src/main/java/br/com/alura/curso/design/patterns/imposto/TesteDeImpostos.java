package br.com.alura.curso.design.patterns.imposto;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(500.0);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
	
}
