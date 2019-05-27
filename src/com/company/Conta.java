package com.company;

public class Conta {

    public String nome;
    public Integer numero;
    public String agencia;
    public Double saldo;
    public Datas dataAbertura;

    public Double depositar (Double valor){
       this.saldo += valor;
       return this.saldo;
    }

    public Double sacar(Double valor){
        this.saldo -= valor;
        return this.saldo;
    }

    public Double calcularRendimento(){
        this.saldo = this.saldo * 0.1;
        return saldo;
    }

    public String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.nome;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData abertura: " + this.dataAbertura.converterData();
        dados += "\nNúmero: " + this.calcularRendimento();
        return dados;
    }

}
