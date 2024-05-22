package com.multi.e_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec01 extends JFrame {

    private JTextField textField2;
    private JButton 누르세요Button;
    private JTextField textField1;
    private JPanel mainPanel;

    public Exec01(){
        setContentPane(mainPanel);
        setTitle("이게뭘까요");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);

        누르세요Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                JOptionPane.showMessageDialog(Exec01.this, "계산결과는 : " + (num1 + num2));

            }
        });
    }

    public static void main(String[] args) {
        new Exec01();
    }
}
