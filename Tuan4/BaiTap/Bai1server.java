package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Bai1server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2611);
            System.out.println("Server created");
            while (true) {
                Socket sk = ss.accept();
                Bai1Thread p = new Bai1Thread(sk);
                p.start();
                }
            
        } catch (Exception e) {
           
        }
    }
}
