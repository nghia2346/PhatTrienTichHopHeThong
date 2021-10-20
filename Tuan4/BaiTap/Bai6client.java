package BaiTap;

import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.Port;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Bai6client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip;
        int port;
        System.out.println("Nhap dia chi ip");
        ip = sc.nextLine();
        System.out.println("Nhap port");
        port = sc.nextInt();
        try {
            Socket sk = new Socket(ip,port);
            System.out.println("Client connected");
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out =  new DataOutputStream(sk.getOutputStream());

      
            while (true) {
                System.out.println("--------Menu---------");
                System.out.println("1. Tong 1+3+5+7+...+(2n+1) ");
                System.out.println("2. Tong 1*2 + 2*3+...+n*(n+1)");
                System.out.println("3. Bieu Thuc 1-2+3-4+..+(2n+1)  ");
                System.out.println("4. Exit");
                        int ch;
                        sc.nextLine();
                   System.out.println("Nhap yeu cau");
                        ch =   sc.nextInt();
                        System.in.skip(2);
                        out.write(ch);
                        if(ch==4){
                            break;
                        }
                    System.out.println("Nhap n");
                    out.writeInt(sc.nextInt());
                            int kq=in.readInt();
                            System.out.println("Ket qua la:"+kq);

             }} catch (Exception e) {
            System.out.println("Loi");
        }
    }
}

