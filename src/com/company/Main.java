package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = c1;

        Datas data = new Datas();

        c1.nome = "Eduardo Santos";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.00;
        c1.dataAbertura = data;


        c1.depositar(100.00);




        System.out.println(c1.recuperaDadosParaImpressao());

        if (c1 == c2){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }

    }
}
