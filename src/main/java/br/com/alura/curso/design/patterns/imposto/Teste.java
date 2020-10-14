package br.com.alura.curso.design.patterns.imposto;

public class Teste {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.0);

        Imposto novoImposto = new ICCC();
        System.out.println(novoImposto.calcula(reforma));
    }
}
