import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPdateserver {
    public static void main(String[] args) {
            try {
                ServerSocket ss = new ServerSocket(9999);
                System.out.println("Server connected");
                Socket sk =ss.accept();
                DataOutputStream out = new DataOutputStream(sk.getOutputStream());
                DataInputStream in = new DataInputStream(sk.getInputStream());
                while (true) {
                    String ch = in.readUTF();
                    if (ch=="exit") {
                        break;
                    }
                     
                }
            } catch (Exception e) {
               
            }

    }
}
