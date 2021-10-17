package BaiTap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Bai4client {
    public static void main(String[] args) {
        int port=2611;
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
            System.out.println("Chon yeu cầu của bạn");
        }
        } catch (Exception e) {
           
        }
    }
}
