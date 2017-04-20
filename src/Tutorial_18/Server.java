package Tutorial_18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Server {

    public final static String HOST = "127.0.0.1";
    public final static int    PORT = 6143;

    private ServerSocket server;

    // Client stuff
    private ArrayList<ClientSocket> connectedClients = new ArrayList<>();
    private Thread clientAcceptanceThread;

    public Server() {
        try {

            server = new ServerSocket(Server.PORT);

            // Start accepting clients
            (clientAcceptanceThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        try {
                            // Accept a new client
                            System.out.println("Listening for new clients...");
                            ClientSocket newClient = new ClientSocket(server.accept());
                            System.out.println("New client accepted!");

                            // Add the new client to the array list
                            connectedClients.add(newClient);

                            // Send welcome messages
                            newClient.send("Welcome to the server!");

                        } catch (IOException ex) {
                            ex.printStackTrace(System.err);
                        }
                    }
                }
            }, "Client Acceptance Thread")).start();

            // Manage existing clients
            while(true) {
                ArrayList<Integer> disconnectedClients = new ArrayList<>();

                // Check for disconnected clients and send/receive messages
                for(int i = 0; i < connectedClients.size(); i++) {
                    ClientSocket client = connectedClients.get(i);
                    try {
                        String message = "Client " + i + ": " + client.receieve();
                        for(int j = 0; j < connectedClients.size(); j++) {
                            if(i != j) {
                                connectedClients.get(j).send(message);
                            }
                        }
                    }
                    catch (SocketException ex) {
                        disconnectedClients.add(i);
                    }
                    catch (SocketTimeoutException ex) {}
                }

                // Remove disconnected clients from ArrayList
                for(int i : disconnectedClients) {
                    connectedClients.remove(i);
                    System.out.println("Client " + i + " has disconnected.");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
