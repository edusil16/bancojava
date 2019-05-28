package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = new Conta();
        System.out.println(c1.getNome());

        c1.setIndentifcador(01);
        c2.setIndentifcador(02);

        if (c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
