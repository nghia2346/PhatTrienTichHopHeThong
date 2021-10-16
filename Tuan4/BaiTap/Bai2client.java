package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.Port;

/**
 * Bai2client
 */
public class Bai2client {
    public static void main(String[] args) {
        int port;
        try {
            
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhap port cua server");
                port = sc.nextInt(); 
            } while (port == 5678);
                    System.out.println("Client connected");
                 Socket sk= new Socket("127.0.0.1",port);
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
        
                while (true) {
                    System.out.println("Nhap tin nhan");
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    String chat = in.readUTF();
                        if (chat.equalsIgnoreCase("out")) {
                            
                        } else {
                            System.out.println("Server:"+ chat);
                        }
                }
        } catch (Exception e) {
            System.out.println("loi");
        }
    }
}