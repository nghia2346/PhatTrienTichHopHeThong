package TCPchat;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class  TCPchatclient {
    public static void main(String[] args) {
        try {
            Socket sk = new Socket("127.0.0.1", 1001);
            System.out.println("Client Connected");
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            DataInputStream in = new DataInputStream(sk.getInputStream());

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n Nhap tin nhan");
                out.writeUTF(sc.nextLine());
                out.flush();

                String str = in.readUTF();

                if (str.equalsIgnoreCase("out")) {
                    break;
                } else {
                    System.out.println("--Server:" + str);
                }
            }
            in.close();
            out.close();
            sk.close();

        } catch (Exception e) {
            System.out.println("Error !");
        }
    }
}