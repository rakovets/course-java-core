package main.java.com.rakovets.course_java_basic.solution.socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
	public static final int KILOBYTE = 1024;
	public static  String SERVER_HOST;//localhost
	public static int SERVER_PORT;//8080
	public static int command;
	public static String filePath;

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter server HOST:\n> ");
		SERVER_HOST = scanner1.nextLine().toLowerCase();
		System.out.print("Enter server PORT:\n> ");
		SERVER_PORT = Integer.parseInt(scanner1.nextLine());
		boolean runMain = true;

		try {
			DatagramSocket socket = new DatagramSocket();

			while (runMain) {
				byte buffer[] = new byte[KILOBYTE];
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				System.out.println("Select number:\t1.LIST files \t2.GET file  \t3.SEND file   \t4.DELETE file" +
						"\t5.Exit");
				System.out.print("> ");
				command = scanner1.nextInt();
				switch (command) {
					case 1:
						System.out.println("Enter filePath to LIST. " +
							"Example: .\\src\\main\\java\\com\\rakovets\\course_java_basic\\solution\\socket\\" +
								"database\\");
						System.out.print("> ");
						filePath = "1" + scanner2.nextLine();
						new ClientSender().toServer(socket, SERVER_HOST, SERVER_PORT, filePath);
						break;
					case 2:
						System.out.println("Enter filePath to GET.");
						System.out.print("> ");
						filePath = "2" + scanner2.nextLine();
						new ClientSender().toServer(socket, SERVER_HOST, SERVER_PORT, filePath);
						break;
					case 3:
						System.out.println("Enter filePath to SEND.");
						System.out.print("> ");
						filePath = "3" + scanner2.nextLine();
						new ClientSender().toServer(socket, SERVER_HOST, SERVER_PORT, filePath);
						break;
					case 4:
						System.out.println("Enter filePath to DELETE.");
						System.out.print("> ");
						filePath = "4" + scanner2.nextLine();
						new ClientSender().toServer(socket, SERVER_HOST, SERVER_PORT, filePath);
						break;
					case 5:
						runMain = false;
						socket.close();
						break;
					default:
						System.out.println("COMMAND NUMBER NOT EXIST");
				}

				socket.receive(packet);
				System.out.printf("< %s\nReceived (%s),\tfrom: %s,\tlength: %s\n\n", new String(packet.getData()),
						new Time().dateTime(), packet.getSocketAddress(), packet.getLength());

			}
		} catch (SocketException e) {
			System.out.println("Sender SocketException " + e);
		} catch (UnknownHostException e) {
			System.out.println("Sender UnknownHostException " + e);
		} catch (IOException e) {
			System.out.println("Sender IOException " + e);
		}
	}
}