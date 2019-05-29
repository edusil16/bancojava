package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PessoaFisica {

    private String cpf;

    public PessoaFisica(String cpf){
        this.cpf = cpf;
    }

    public PessoaFisica(){

    }

    public String getCpf() {
        return cpf;
    }

    public Boolean isCpfValido(){
       return this.cpf.matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)");
    }

    public Boolean isCpfValido(String cpf){
        return cpf.matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)");
    }

    public void setCpf(String cpf) throws Exception {
        if(!isCpfValido(cpf)){
            throw new Exception("Este cpf nao é valido");
        }
        this.cpf = cpf;
    }
}