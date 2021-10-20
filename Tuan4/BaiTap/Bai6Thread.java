package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Bai6Thread extends Thread {
    Socket sk;
    Bai6Thread(Socket sk){
    this.sk = sk;
    }
    public void run(){
        try {
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out =  new DataOutputStream(sk.getOutputStream());
            while (true) {
                int ch = in.read();
                int Tong =0;
                int Tong2=0;
                int Tong3= 0;
                int n=in.readInt();
                 switch (ch) {
                     case 1:
                     for(int i=0;i<n;i++){
                        Tong = Tong +(2*i+1);
                    }
                         break;
                         case 2:
                         for(int i=0;i<=n;i++){
                            Tong2= Tong2 +(i*(i+1));
                        }
                             break;
                             case 3:
                             int t=-1;
                             for(int i=0;i<=n;i++){
                                t=t*-1;
                                Tong3=Tong3+(t*i);
                            }
                                 break;
                                 case 4:
                                 ch=4;
                                     break;
                     default:
                     System.out.println("Chon sai hay chon lai");
                         break;
                 }
 
              out.writeInt(Tong);
              out.writeInt(Tong2);
              out.writeInt(Tong3);
            }
        } catch (Exception e) {
           
        }
    }
    }
