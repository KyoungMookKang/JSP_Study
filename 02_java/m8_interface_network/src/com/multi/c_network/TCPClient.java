package com.multi.c_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 클라이언트 입장에서는 서버의 ip, port 를 알아야 한다.
        for(int i = 0; i < 100; i++){

            // 2. 서버의 ip 주소와 포트를 매개 변수로 하여 클라이언트용 소켓 객체를 생성
            Socket socket = new Socket("localhost", 9200);

            // 3. 서버와 통신할 스트림 오픈
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String data = bufferedReader.readLine();
            System.out.println("서버에서 받는 데이터 " + data);
        }
    }
}
