package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sk= new Socket("127.0.0.1",1111);
            System.out.println("Client connected");
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Nhap n:");
                int n= sc.nextInt();
                out.writeInt(n);
                if(n==0){
                    break;
                }
                String ch= in.readUTF();
                System.out.println(ch);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
