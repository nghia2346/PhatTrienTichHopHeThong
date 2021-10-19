package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Bai2server {
    public static void main(String[] args) {
        int port =5678;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server created:  " + port);
            while (true) {
                Socket sk= ss.accept();
                Bai2Thread p = new Bai2Thread(sk);
                p.start();
            }
        } catch (Exception e) {
            System.out.println("lỗi");
        }
    }
}
