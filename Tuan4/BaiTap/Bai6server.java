package BaiTap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Bai6server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server created");
            Socket sk = ss.accept();
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out =  new DataOutputStream(sk.getOutputStream());
            while (true) {
                String ch = in.readUTF();
                int Tong =0;
                int Tong2=0;
                Float Tong3=(float) 0;
                int n=in.readInt();
                 switch (ch) {
                     case "1":
                     for(int i=0;i<=n;i++){
                        Tong = Tong +(2*i+1);
                    }
                         break;
                         case "2":
                         for(int i=0;i<=n;i++){
                            Tong2= Tong2 +(n*(n+1));
                        }
                             break;
                             case "3":
                             for(int i=0;i<=n;i++){
                                Tong3= Tong3+ Pow(-1,i+1) *i;
                            }
                                 break;
                                 case "4":
                                 ch="out";
                                     break;
                     default:
                     System.out.println("Chon sai hay chon lai");
                         break;
                 }
 
              out.writeInt(Tong);
              out.writeInt(Tong2);
              out.writeFloat(Tong3);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    private static int Pow(int i, int j) {
        return 0;
    }
}
