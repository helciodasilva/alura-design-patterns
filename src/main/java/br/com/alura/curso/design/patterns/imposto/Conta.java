package br.com.alura.curso.design.patterns.imposto;

class Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
