package com.company;

public class Conta {

    private Integer indentifcador;
    private String nome;
    private Integer numero;
    private String agencia;
    private Double saldo;
    private Datas dataAbertura;

    public Conta(){

    }

    public Conta(String nome) {
        this.nome = nome;
    }

    public Integer getIndentifcador() {
        return indentifcador;
    }

    public void setIndentifcador(Integer indentifcador) {
        this.indentifcador = indentifcador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Datas getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Datas dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double depositar (Double valor){
       this.saldo += valor;
       return this.saldo;
    }

    public Double sacar(Double valor){
        this.saldo -= valor;
        return this.saldo;
    }

    public Double getRendimento(){
        this.saldo = this.saldo * 0.1;
        return saldo;
    }

    public String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.nome;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData abertura: " + this.dataAbertura.dataAtual();
        dados += "\nNúmero: " + this.getRendimento();
        return dados;
    }

}
