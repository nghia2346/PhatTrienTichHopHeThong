package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Bai2server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5678);
            System.out.println("Server created");
            Socket sk = ss.accept();
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                String chat = in.readUTF();
             if (chat.equalsIgnoreCase("out")) {
                    break;
             } else {
                 System.out.println("Client:"+ chat);
             }
             System.out.println("Nhap tin nhan");
             out.writeUTF(sc.nextLine());
                out.flush();
            }
            in.close();
            out.close();
            sk.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("lỗi");
        }
    }
}
