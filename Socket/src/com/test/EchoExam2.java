package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
class MultiThread implements Runnable {
 
    Socket connection;
 
    public MultiThread(Socket connection) {
        this.connection = connection;
    }
 
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
 
            Date now = new Date();
            out.write(now.toString() + "\r\n"); 
            out.flush();
 
            System.out.println("Client Connect Success!");
 
            for (String data = in.readLine(); data != null; data = in.readLine()) {
 
                if (data.equals("exit")) { 
                    out.write("bye bye \r\n"); 
                    System.out.println("bye bye"); 
 
                    in.close();
                    out.close();
 
                    connection.close();
                    break;
                }
                System.out.println("Client >> " + data);
                out.write("echo : " + data + "\r\n"); 
                out.flush();
            }
 
            System.out.println(now.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
 
public class EchoExam2 {
    private static final int PORT = 1314;
    private static final String HOST = "localhost";
    private static final int pool = 50;
 
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(EchoExam2.pool);
 
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                System.out.println("wait.....");
                Socket socket = server.accept();
 
                Runnable task = new MultiThread(socket);
 
                service.submit(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}