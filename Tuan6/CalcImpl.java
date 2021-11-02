import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements CalcInterface {

    protected CalcImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public int cong(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public int tru(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        return a - b;
    }

}
