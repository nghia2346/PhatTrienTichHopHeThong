package TCPso;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPsoserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7);
            System.out.println("Server da duoc tao");
            while (true) {
                try {
                    Socket s = ss.accept();
                    OutputStream os = s.getOutputStream();
                    InputStream is = s.getInputStream();
                    while (true) {
                        int ch = is.read();
                        if (ch == '@')
                            break;
                        String kq = "";
                        switch (ch) {
                            case '0':
                                kq = "khong";
                                break;
                            case '1':
                                kq = "Mot";
                                break;
                            case '2':
                                kq = "Hai";
                                break;
                            case '3':
                                kq = "Ba";
                                break;
                            case '4':
                                kq = "Bon";
                                break;
                            case '5':
                                kq = "Nam";
                                break;
                            case '6':
                                kq = "Sau";
                                break;
                            case '7':
                                kq = "Bay";
                                break;
                            case '8':
                                kq = "Tam";
                                break;
                            case '9':
                                kq = "Chin";
                                break;
                            default: kq ="Khong phai so nguyen!";
                        }
                        os.write(kq.getBytes());
                    }
                    s.close();
                } catch (IOException ie1) {
                    System.out.println("Connection Error:" + ie1);
                }
            }
        } catch (IOException ie) {
            System.out.println("Sever Creation Error:" + ie);
        }
    }
}