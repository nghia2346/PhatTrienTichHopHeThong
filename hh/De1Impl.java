

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class De1Impl extends UnicastRemoteObject implements De1Interface {
    protected De1Impl() throws RemoteException{
        super();
    }
    @Override
    public int Count(String ct) throws RemoteException{
        int i = 0;
        for (int j = 0; j < ct.length(); j++){
            if (j == ct.length()-1){
                i += 0;
            }else{
            if (ct.charAt(j) == ' '){
                if ((ct.charAt(j+1) == '\n') || (ct.charAt(j+1) == ' ')){
                    i += 0;
                }else{
                    i++;
                }
            }
        }
        }
        if (ct.charAt(0) == ' '){
            System.out.println(i);
        }else{
            System.out.println(i+1);
        }
        return i;
    }
    @Override
    public StringBuilder Daonguoc(String ct) throws RemoteException {
        StringBuilder s = new StringBuilder(ct);
        System.out.println("Chuoi dao nguoc = " + s.reverse().toString());
        return s;
    }

}
