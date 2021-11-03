
import java.nio.channels.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class De1server {
    public static void main(String[] args) throws AlreadyBoundException {
        try {
            De1Interface cInterface = new De1Impl();
            System.out.println("Khoi tao IMPL");
            LocateRegistry.createRegistry(8888);
            Registry reg = LocateRegistry.getRegistry(8888);
            reg.bind("CalcObj", cInterface);
            System.out.println("Calc Registed");
        } catch (Exception e) {
        }
    }
}
