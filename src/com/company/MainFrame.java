package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class MainFrame {
    private JButton btnCalc;
    private JTextField txtAno;
    private JLabel lblidade;
    private JLabel lblSituacao;

        public MainFrame(MainFrame String[]) {

        }

        {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int ano = Integer.parseInt(txtAno.getText());
                int idade = 2023 - ano;
                lblidade.setText(Integer.toString(idade));


            }
        });
    }
}
