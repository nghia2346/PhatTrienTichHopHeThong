

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class De1Impl extends UnicastRemoteObject implements De1Interface {
    protected De1Impl() throws RemoteException{
        super();
    }
    @Override
    public int Count(String ct) throws RemoteException{
        int i = 0, count = 1;
        char[] s1 = ct.toCharArray();
        
        while(s1[i] == ' ')
        {
            i++;
        }

        for (int j = i; j < s1.length - 1; j++)
        {
            if(s1[j] == ' ' && s1[j + 1] != ' ')
            {
                count++;
            }
        }

        return count;
    }

}
