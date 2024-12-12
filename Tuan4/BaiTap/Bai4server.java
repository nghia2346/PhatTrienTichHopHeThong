package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai4server {
    public static void main(String[] args) {
        int port=2611;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server created:  " + port);
            while (true) {
                Socket sk= ss.accept();
                Bai4Thread p = new Bai4Thread(sk);
                p.start();
            }
        } catch (Exception e) {
        }
    }
}
