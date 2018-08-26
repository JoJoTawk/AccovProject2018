

package agora;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jhonny Tawk
 */
public class AgoraClass {

  public static void main(String[] args) throws IOException {
        ServerSocket l = new ServerSocket(2010);
        GestionListeClients listeClients = new GestionListeClients();
        System.out.println(l.getLocalSocketAddress());
        while (true) {
            Socket serviceSocket = l.accept();
            Thread nc = new Thread(new EchoService(serviceSocket,listeClients));
            nc.setDaemon(true);
            nc.start();
        }
    }
    
}
