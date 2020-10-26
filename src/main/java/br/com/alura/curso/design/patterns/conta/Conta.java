package br.com.alura.curso.design.patterns.conta;

import java.util.Calendar;

public class Conta {
	private String titular;
	private double saldo;
	private String name;
	private String numero;
	private String agencia;
	private Calendar dataAbertura;
	private int valor;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return name;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public int getValor() {
		return valor;
	}

}
