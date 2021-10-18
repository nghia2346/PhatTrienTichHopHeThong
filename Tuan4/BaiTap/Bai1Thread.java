package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Bai1Thread
 */
public class Bai1Thread extends Thread {
        Socket s;
        Bai1Thread(Socket s){
            this.s=s;
        }
    public void run(){
        try {
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
              int ch = in.read();
             
                String kq = "" ;
                switch (ch) {
                    case 0:
                        kq = "Khong";
                        break;
                    case 1:
                        kq = "Mot";
                        break;
                    case 2:
                        kq = "Hai";
                        break;  
                     case 3:
                        kq = "Ba";
                        break;
                      case 4:
                        kq = "Bon";
                        break;  
                     case 5:
                        kq = "Nam";
                        break;  
                     case 6:
                        kq = "Sau";
                        break;  
                     case 7:
                        kq = "Bay";
                        break; 
                      case 8:
                        kq = "Tam";
                        break;  
                     case 9:
                        kq = "Chin";
                        break;
                    default:
                    kq="Khong phai so nguyen";
                      
                }
                out.writeUTF(kq);
                out.flush();
            }
        } catch (Exception e) {
           
        }
    }
    }
