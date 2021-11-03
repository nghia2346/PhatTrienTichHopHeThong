

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class De1client {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(7777);
            De1Interface cInterface = (De1Interface) reg.lookup("CalcObj");
            System.out.println("Nhap vao mot chuoi: ");
            Scanner sc = new Scanner(System.in);
            String ct = sc.nextLine();
            System.out.println("So luong ki tu la"+ cInterface.Count(ct));
        } catch (Exception e) {
            // TODO: handle exception
        }
    } 
}
