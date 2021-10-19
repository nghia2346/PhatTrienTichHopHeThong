package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Bai2Thread extends Thread {
    Socket sk;
    Bai2Thread(Socket sk){
        this.sk=sk;
    }
    public void run(){
        try {
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                
                String chat = in.readUTF();

             if (chat.equalsIgnoreCase("out")) {
                    break;
             } else {
                System.out.println("Tin nhan cua Client:\n"+ chat);
             }
             System.out.println("Nhap tin nhan");
            out.writeUTF(sc.nextLine());
             out.flush();
            }
        } catch (Exception e) {
            System.out.println("lỗi");
        }
    }
}
