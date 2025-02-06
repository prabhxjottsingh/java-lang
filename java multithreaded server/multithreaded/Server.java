import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {

    public Consumer<Socket> getConsumer(){
        return (clientSocket) -> {
            try{
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        };
    }

    public static void main(String[] args){
        int PORT = 8080;
        int serverSocketTimeoutInMs = 10000;
        Server server = new Server();   

        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
            serverSocket.setSoTimeout(serverSocketTimeoutInMs);

            System.out.println("Server started on port " + PORT);

            while(true){
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket acceptedSocket = serverSocket.accept();
                Thread thread = new Thread(() -> server.getConsumer().accept(acceptedSocket));
                thread.start();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
