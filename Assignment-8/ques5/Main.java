import java.io.IOException;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        socket.connect(InetAddress.getByName("ping.online.net"), 4444);

        System.out.println("socket.getLocalSocketAddress() returns: " + socket.getLocalSocketAddress());
        System.out.println("socket.getPort() returns: " + socket.getPort());
        System.out.println("socket.isClosed() returns: " + socket.isClosed());
        System.out.println("socket.isConnected() returns: " + socket.isConnected());
        System.out.println("sending 'hello'...");
        socket.send(new DatagramPacket("hello".getBytes(), 5));
        System.out.println("socket.getReceiveBufferSize() returns: " + socket.getReceiveBufferSize());
        socket.close();
    }
}
