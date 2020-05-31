package main.java.com.rakovets.course_java_basic.solution.socket;

import java.io.IOException;
import java.net.*;

public class ServerSender {
	public static final int KILOBYTE = 1024;

	public  void toClient(DatagramSocket socket, String SERVER_HOST, int SERVER_PORT, String message) {
		try {
			byte data[] = new byte[KILOBYTE];
			DatagramPacket packet =
					new DatagramPacket(data, data.length, InetAddress.getByName(SERVER_HOST), SERVER_PORT);
			packet.setData(message.getBytes());
			socket.send(packet);
			System.out.printf("> %s\nSent (%s),\tto: %s, \tlength: %s\n\n", message, new Time().dateTime(),
					packet.getSocketAddress(), packet.getLength());
			packet.setData(new byte[KILOBYTE]);

		} catch (SocketException e) {
			System.out.println("Sender SocketException " + e);
		} catch (UnknownHostException e) {
			System.out.println("Sender UnknownHostException " + e);
		} catch (IOException e) {
			System.out.println("Sender IOException " + e);
		}
	}
}