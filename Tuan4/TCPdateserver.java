import java.net.ServerSocket;

public class TCPdateserver {
    public static void main(String[] args) {
            try {
                ServerSocket ss = new ServerSocket(9999);
                System.out.println("Server connected");
                
                while (true) {
                    
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

    }
}
