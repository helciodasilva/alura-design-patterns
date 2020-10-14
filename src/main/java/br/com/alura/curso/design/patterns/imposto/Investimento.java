package br.com.alura.curso.design.patterns.imposto;

import java.util.Random;

interface Investimento {
    double calcula(Conta conta);
}

class Conservador implements Investimento{
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}

class Moderado implements Investimento {
    private Random random;

    public Moderado() {
        this.random = new Random();
    }

    public double calcula(Conta conta) {
        if(random.nextInt(2) == 0) return conta.getSaldo() * 0.025;
        else return conta.getSaldo() * 0.007;
    }
}

class Arrojado implements Investimento {
    private Random random;

    public Arrojado() {
        this.random = new Random();
    }

    public double calcula(Conta conta) {
        int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1) return conta.getSaldo() * 0.05;
        else if (chute >= 2 && chute <= 4) return conta.getSaldo() * 0.03;
        else return conta.getSaldo() * 0.006;
    }
}
