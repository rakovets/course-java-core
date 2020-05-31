package main.java.com.rakovets.course_java_basic.solution.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 8080;
	public static final int KILOBYTE = 1024;

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(SERVER_PORT);
			System.out.printf("\nServer started   (%s)\n\n", new Time().dateTime());

			byte buffer[] = new byte[KILOBYTE];
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

			while (true) {
				socket.receive(packet);
				byte[] data = new byte[packet.getLength()];
				System.arraycopy(packet.getData(), packet.getOffset(), data, 0, packet.getLength());
				System.out.printf("< %s\nReceived (%s),\tfrom: %s,\tlength: %s\n\n", new String (data),
						new Time().dateTime(), packet.getSocketAddress(), packet.getLength());

				switch (new String (data).substring(0,1)) {
					case "1":
						new ServerSender().toClient(socket, SERVER_HOST, packet.getPort(),
								new FileOperations().listFiles(new String (data).substring(1)));
						break;
					case "2":
						new ServerSender().toClient(socket, SERVER_HOST, packet.getPort(),
								new FileOperations().returnFile(new String (data).substring(1)));
						break;
					case "3":
						new ServerSender().toClient(socket, SERVER_HOST, packet.getPort(),
								new FileOperations().createNewFile(new String (data).substring(1)));
						break;
					case "4":
						new ServerSender().toClient(socket, SERVER_HOST, packet.getPort(),
								new FileOperations().deleteFile(new String (data).substring(1)));
						break;
					default:
						new ServerSender().toClient(socket, SERVER_HOST, packet.getPort(),
								"COMMAND NUMBER NOT EXIST");
				}
				packet.setData(new byte[KILOBYTE]);
			}
		} catch (SocketException e) {
			System.out.println("Receiver SocketException: " + e);
		} catch (IOException e) {
			System.out.println("Receiver IOException: " + e);
		}
	}
}