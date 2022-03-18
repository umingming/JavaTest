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
        	System.out.println(1);
            Socket client = new Socket("192.168.1.2", 9800);            
            InputStreamReader isr2 = new InputStreamReader(System.in);
            BufferedReader keyboard = new BufferedReader(isr2);
            System.out.println(2);
            
            //서버에 내용을 전송할 객체
            OutputStream os = client.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os);
            PrintWriter pw = new PrintWriter(osr);
            
            System.out.println(3);
            //서버에서 재전송한 내용을 받는 객체
            InputStream is = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println(4);
            while(true) {
                System.out.println("서버에 전송할 메세지 입력(quit입력시 종료) : ");
                String msg = keyboard.readLine();
                if(msg.equals("quit")) {
                    System.out.println("서버와의 연결을 종료 합니다.");
                    client.close();
                    break;
                }
                pw.println(msg);
                pw.flush();
                
                String echoMsg = br.readLine();
                System.out.println("서버에서 전송된 메세지 : " + echoMsg);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}