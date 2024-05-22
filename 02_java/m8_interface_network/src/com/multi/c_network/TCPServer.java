package com.multi.c_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(9200);

        System.out.println("클라이언트의 요청을 기다리는 중");

        int count = 0;

        while(true){
            // 2. 클라이언트에서 접속 요청이 오면 요청을 수락한 후 클라이언트에 대한 소켓 생성
            Socket socket = server.accept();
            count++;
            System.out.println("클라이언트 연결 됨 > " + count + " 접속 ");
            // 3. 연결된 클라이언트와 스트림 생성
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 4. 소켓 닫기
            out.print("Java programmer");
            out.close();
            socket.close();
        }
    }
}
