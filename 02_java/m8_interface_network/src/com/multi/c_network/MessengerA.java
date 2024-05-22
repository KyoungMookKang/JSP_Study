package com.multi.c_network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessengerA extends JFrame {

    DatagramSocket socket;
    JTextArea list;
    JTextField input;


    public MessengerA() throws Exception {
        socket = new DatagramSocket(9400);

        setTitle("메신저A");
        setSize(500, 500);
        list = new JTextArea();
        input = new JTextField();

        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        Font font = new Font("궁서", Font.BOLD, 30);
        list.setFont(font);
        input.setFont(font);

//배경색
        list.setBackground(Color.green);
        input.setBackground(Color.yellow);

//글자색
        list.setForeground(Color.blue);
        input.setForeground(Color.red);

        list.setEditable(false); // 수정을 막는 기능

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.append("나 >> " + input.getText() + "\n");

                try {
                    DatagramSocket socket = new DatagramSocket();

                    InetAddress ip = InetAddress.getByName("127.0.0.1");

                    String str = input.getText();

                    byte[] data = str.getBytes();

                    DatagramPacket packet = new DatagramPacket(data, data.length, ip, 9500);

                    socket.send(packet);
                    socket.close();

                    input.setText(" ");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);


    }
    // 상대의 메시지를 받아서 textArea 에 출력
    public void process() throws IOException {
        while (true){
            byte[] data = new byte[256];

            DatagramPacket packet = new DatagramPacket(data, data.length);

            socket.receive(packet);

            list.append("You >> " + new String(data) + "\n");
        }


    }
    public static void main(String[] args) throws Exception {

        MessengerA ma = new MessengerA();
        ma.process();

    }
}
