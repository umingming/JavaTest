package com.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
/*
 *     [Server]
 *     Construct
 *         : ServerSocket(int port)
 *     Method
 *         : Socket accept() -> 클라이언트의 요청을 받아 들인 다음 클라이언트에 연결된 소켓 클래스 객체 반환
 *         : void close() -> 서버소켓을 닫는다.
 */
 
public class EchoServerMain {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9800);
            System.out.println("클라이언트의 요청을 기다립니다.");
            Socket client = server.accept();
            System.out.println("접속한 클라이언트 정보 : " + "[" + client.getInetAddress().getHostName()+"]");
            
            //클라이언트에서 전송한 메세지를 받는 객체
            InputStream is = client.getInputStream();
            InputStreamReader dis = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(dis);
             
            //받은 메세지를 클라이언트에 재전송할 객체
            OutputStream os = client.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            // 모든 입력을 다 받을 수 있는 것, 동기식에서 모든 예외처리!
            PrintWriter pw = new PrintWriter(osw);
            /*
             * 동기 : 일정 신호를 받았을 때 다음 동작하는 것.
             * 비동기 : 타겟의 상태와 상관없이 일방적인 동작하는 것.
             */
            while(true) {
                String msg = br.readLine();
                System.out.println("받은 메세지 : " + msg);
                if ( msg == null ) {
                    System.out.println(client.getInetAddress() + "연결을 종료합니다.");
                    client.close();
                    server.close();
                    break;
                }
                //재전송
                pw.println(msg);
                pw.flush();
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
