package BaiTap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Bai4client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int port ;
        String ip;
        System.out.println("Nhap dia chi ip");
        ip = sc.nextLine();
        System.out.println("Nhap port");
        port = sc.nextInt();
        try{
      
        Socket sk= new Socket(ip,port);
         System.out.println("Client connected");
        DataInputStream in = new DataInputStream(sk.getInputStream());
        DataOutputStream out = new DataOutputStream(sk.getOutputStream());
        System.out.println("------------Menu-----------");
        System.out.println("1. Time");
        System.out.println("2. Date");
        System.out.println("3. Date & Time");
        System.out.println("4. Exit");

        while (true) {
            sc.nextLine();
            System.out.println("Chon Yeu Cau:");
            int n = sc.nextInt();

            out.write(n);
    
            String kq = in.readUTF();
            if (kq.equalsIgnoreCase("4")) {
                break;
            } else {
                System.out.println("Ket qua la :" + kq);
            }
        }
        } catch (Exception e) {
           System.out.println("Loi");
        }
    }
}
