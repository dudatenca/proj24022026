package org.example.models;

public class ContaBancaria {

    private String  titular;
    private double saldo;

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

    public ContaBancaria(String titular, double saldo){
        this.saldo=saldo;
        this.titular=titular;
    }
    public ContaBancaria(){}
}
