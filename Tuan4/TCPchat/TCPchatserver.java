package TCPchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPchatserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1001);
            System.out.println("Server Connected");
            Socket sk = ss.accept();
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            DataInputStream in = new DataInputStream(sk.getInputStream());

            Scanner sc = new Scanner(System.in);
            while (true) {
                String str = in.readUTF();
                
                if (str.equalsIgnoreCase("out")) {
                    break;
                } else {
                    System.out.println("--Client:" + str);
                }
                System.out.println("\nNhap tin nhan:");
                out.writeUTF(sc.nextLine());
                out.flush();
            }
            in.close();
            out.close();
            sk.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error !");

        }
    }
}

