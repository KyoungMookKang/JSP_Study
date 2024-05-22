package com.multi.c_network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws Exception {

        // 소켓 생성
        DatagramSocket socket = new DatagramSocket();

        // 패킷에 ip와 포트를 넘겨줘야 하므로 ip 변수에 담기
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        // 보낼 메시지
        String str = "허리가 아프다";

        // 바이트로 변환
        byte[] data = str.getBytes();

        // 패킷 생성, 데이터, 길이, ip, port 로 생성
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 9300);

        // socket 을 사용해서 packet 전달
        socket.send(packet);
        // 소켓 닫기
        socket.close();
    }
}
