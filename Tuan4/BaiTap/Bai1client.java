package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Bai1client {
    public static void main(String[] args) {
       try {
        Socket sk= new Socket("127.0.0.1",2611);
        System.out.println("Client connected");
        DataInputStream in = new DataInputStream(sk.getInputStream());
        DataOutputStream out = new DataOutputStream(sk.getOutputStream());
      
        while (true) {
            System.out.println("Nhap so tu 0 den 9");
            int ch = System.in.read();
            out.write(ch);
            String kq = in.readUTF();
            System.out.println("Chuyen qua ki tu :"+ kq);
          
        }
       } catch (Exception e) {
           //TODO: handle exception
       }
    }
}
