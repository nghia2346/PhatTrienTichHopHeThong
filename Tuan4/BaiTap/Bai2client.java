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
        String ip;
        Scanner sc = new Scanner(System.in);
        try { 
                System.out.println("Nhap dia chi ip");
                ip= sc.nextLine();
            do {
                System.out.println("Nhap port cua server");
                port = sc.nextInt(); 
            } while (port !=5678);
            Socket sk= new Socket(ip,port);
             System.out.println("Client connected");
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());

                while (true) {
                    System.out.println("Nhap tin nhan");
                    out.writeUTF(sc.nextLine());
                       out.flush();
                    String chat = in.readUTF();
                        if (chat.equalsIgnoreCase("out")) {
                            break;
                        } else { 
                            System.out.println("Tin nhan cua Server:\n"+ chat);
                        }

                }         
        } catch (Exception e) {
            System.out.println("Nhap sai");
        }
    }
}