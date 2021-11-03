

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface De1Interface extends Remote{
    public int Count(String ct) throws RemoteException;
}