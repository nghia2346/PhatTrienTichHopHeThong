package Test;

import java.nio.channels.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcServer {
    public static void main(String[] args) throws AlreadyBoundException {
        try {
            CalcInterface cInterface = new CalcImpl();
            System.out.println("Khoi tao IMPL");
            LocateRegistry.createRegistry(7777);
            Registry reg = LocateRegistry.getRegistry(7777);
            reg.bind("CalcObj", cInterface);
            System.out.println("Calc Registed");
            
        } catch (Exception e) {
        }
    }
}
