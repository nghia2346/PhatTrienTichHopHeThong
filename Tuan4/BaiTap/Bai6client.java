package BaiTap;

import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Bai6client {
    public static void main(String[] args) {
        try {
            Socket sk = new Socket("127.0.0.1",3333);
            System.out.println("Client connected");
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out =  new DataOutputStream(sk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("--------Menu---------");
            System.out.println("1. Tong 1+3+5+7+...+(2n+1) ");
            System.out.println("2. Tong 1*2 + 2*3+...+n*(n+1)");
            System.out.println("3. Bieu Thuc 1-2+3-4+..+(2n+1)  ");
            while (true) {
                
                System.out.println("Nhap yeu cau");
                String ch=sc.nextLine();
                out.writeUTF(ch);
                out.flush();
                System.out.println("Nhap n");
                int n= sc.nextInt();
                out.writeInt(n);
                out.flush();
                int Tong= in.readInt();
                int Tong2= in.readInt();
                float Tong3=in.readFloat();
                out.writeInt(n);
                if (ch.equalsIgnoreCase("1")) {
                    System.out.println("Ket qua la: "+Tong);
                } else if (ch.equalsIgnoreCase("2")) {
                    System.out.println("Ket qua la: "+Tong2);
                } else if (ch.equalsIgnoreCase("3")) {
                    System.out.println("Ket Qua la: "+Tong3);
                }       
                
             }} catch (Exception e) {
            System.out.println("Loi");
        }
    }
}

