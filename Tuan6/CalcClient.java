import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcClient {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(7777);
            CalcInterface cInterface = (CalcInterface) reg.lookup("CalcObj");
            System.out.println("10 + 7 = " + cInterface.cong(10, 7));
            System.out.println("20 - 9 =" + cInterface.tru(20, 9));
        } catch (Exception e) {
        }
    }   
}
