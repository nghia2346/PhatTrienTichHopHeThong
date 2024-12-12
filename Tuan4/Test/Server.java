package Test;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            System.out.println("Server created");
            while (true) {
                Socket sk = ss.accept();
                Thread1 p = new Thread1(sk);
                p.start();
            }
        } catch (Exception e) {
            
        }
    }
}
