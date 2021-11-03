

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class De1client {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(8888);
            De1Interface cInterface = (De1Interface) reg.lookup("CalcObj");
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("-----Menu-----");
                System.out.println("1. Dem so ki tu");
                System.out.println("2. Dao nguoc");
                System.out.println("Nhap lua chon");
                int ch=sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap vao mot chuoi: ");
                String ct = sc.nextLine();
                if (ct.equalsIgnoreCase("exit")) {
                    break;
                }
                switch (ch) {
                    case 1:
                        System.out.println(cInterface.Count(ct));
                        break;
                        case 2:
                        System.out.println(cInterface.Daonguoc(ct));
                        break;
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
