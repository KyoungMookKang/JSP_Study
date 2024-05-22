package com.multi.c_network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

    public static void main(String[] args) throws IOException {


        // UDP 소켓 생성
        DatagramSocket socket = new DatagramSocket(9300);

        // 바이트 배열로 받기 < 받을 공간 생성
        byte[] data = new byte[256];

        // 받을 패킷을 생성 후 대기
        DatagramPacket packet = new DatagramPacket(data, data.length);

        System.out.println("받을 준비중");

        // 패킷이 전달되면 받음
        socket.receive(packet);

        System.out.println(new String(data));

        // 소켓 닫기
        socket.close();

    }
}
