package com.company;

public class Gerente extends Funcionario {
    private Integer senha;
    private Integer numeroDeFuncionariosGerenciados;

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(Integer numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return  true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
}
