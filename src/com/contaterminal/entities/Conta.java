package com.contaterminal.entities;

public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s," +
                        "\nobrigado por criar uma conta em nosso banco, " +
                        "\nsua agência é %s, conta %d " +
                        "\ne seu saldo %.2f já está disponível para saque.",
                this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
}

