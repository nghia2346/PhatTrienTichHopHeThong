package TCPso;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPsoclient {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 7;
    public static void main(String[] args) throws InterruptedException, IOException {
        Socket s = null;
        try {
            s = new Socket(serverIP, serverPort);
            System.out.println("Client da duoc tao");
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();
            while (true) {
                System.out.println("nhap so:");
                int ch = System.in.read();
                System.in.skip(2);
                os.write(ch);
                if (ch == '@')
                    break;
                byte b[] = new byte[100];
                int n = is.read(b);
                String kq = new String(b, 0, n);
                System.out.println("ket qua: " + kq);
            }
        } catch (IOException ie) {
            System.out.println("Error: Can not create socket");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}