import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server{

    public void run() throws Exception, IOException{
        
        int PORT = 8080;
        int sockerTimeoutInMs = 10000;

        ServerSocket serverSocket = new ServerSocket(PORT);
        serverSocket.setSoTimeout(sockerTimeoutInMs);
        
        try{
            while(true){
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket acceptedConnection = serverSocket.accept(); // code will be stoppped here, untill a client gets connected to it
                System.out.println("Just connected to " + acceptedConnection.getRemoteSocketAddress());
                PrintWriter toClient =  new PrintWriter(acceptedConnection.getOutputStream());
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
                toClient.println("Hello Client, I am server");
            }
        }finally{
            serverSocket.close();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try{
            server.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}