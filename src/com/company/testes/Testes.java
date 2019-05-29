package com.company.testes;

import com.company.inteface.ContasForm;

import javax.swing.*;

public class Testes {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("ContasForm");
        frame.setContentPane(new ContasForm().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
