package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai4server {
    public static void main(String[] args) {
        int port=2611;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server created:  " + port);
            Socket sk = ss.accept();
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
      
            while (true) {
                String ch = in.readUTF();
                Date dt = new Date();
                    String kq="";
                    switch (ch) {
                        case "1":
                            SimpleDateFormat  dft = new SimpleDateFormat("HH:mm:ss");
                                kq =dft.format(dt);
                            break;
                            case "2":
                            SimpleDateFormat  dfd = new SimpleDateFormat("E dd.MM.yyyy");
                                kq =dfd.format(dt);
                            break;
                            case "3":
                            SimpleDateFormat df = new SimpleDateFormat("E dd.MM.yyyy 'at' HH:mm:ss");
                                kq= df.format(dt);
                                break;
                            case "4":
                                kq="4";
                                break;
                        default:
                            kq="Chon sai hay chon lai";
                            break;
                    
                    }
                    out.writeUTF(kq);
            }
        } catch (Exception e) {
        }
    }
}
