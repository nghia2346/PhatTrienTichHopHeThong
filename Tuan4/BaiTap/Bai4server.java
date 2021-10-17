package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Bai4server {
    public static void main(String[] args) {
        int port=2611;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server created:  " + port);
            Socket sk = ss.accept();
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
        } catch (Exception e) {
            
        }
    }
}
