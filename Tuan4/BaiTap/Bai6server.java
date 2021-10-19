package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Bai6server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server created  3333");
            while (true) {
                Socket sk= ss.accept();
                Bai6Thread p = new Bai6Thread(sk);
                p.start();
            }
        } catch (Exception e) {
           
        }
    }


}
