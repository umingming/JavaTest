package com.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
 
public class EchoClientMain {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 9800);            
            InputStreamReader isr2 = new InputStreamReader(System.in);
            BufferedReader keyboard = new BufferedReader(isr2);
            
            //서버에 내용을 전송할 객체
            OutputStream os = client.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os);
            PrintWriter pw = new PrintWriter(osr);
            
            //서버에서 재전송한 내용을 받는 객체
            InputStream is = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println("[quit 입력시 종료]");
            while(true) {
                System.out.print("[메시지 입력]");
                String msg = keyboard.readLine();
                if(msg.equals("quit")) {
                    System.out.println("[연결 종료]");
                    client.close();
                    break;
                }
                pw.println(msg);
                pw.flush();
                
                String echoMsg = br.readLine();
                System.out.println("[메시지 전송]" + echoMsg);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}