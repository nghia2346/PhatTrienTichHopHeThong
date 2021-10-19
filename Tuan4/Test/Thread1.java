package Test;

/**
 * Thread1
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Thread1 extends Thread {
    Socket sk;

    Thread1(Socket sk) {
        this.sk = sk;
    }

    public void run() {
        try {
            DataInputStream in = new DataInputStream(sk.getInputStream());
            DataOutputStream out = new DataOutputStream(sk.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                int n = in.readInt();
                String ch;
                if (songuyento(n)) {
                    ch=n+" la so nguyen to";
                } else {
                    ch=n+" khong phai la so nguyen to";
                }
                out.writeUTF(ch);
            }
        } catch (Exception e) {
            System.out.println("Loi");
        }

    }
    public static boolean songuyento(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}