import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public void run() throws Exception{
        int PORT = 8080;
        InetAddress serverAddress = InetAddress.getByName("localhost");
        Socket serverSocket = new Socket(serverAddress, PORT);
        
        try{
            PrintWriter toServerSocket = new PrintWriter(serverSocket.getOutputStream());
            BufferedReader fromServerSocket = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            toServerSocket.println("Hello Server, I am client");
            String readLine = fromServerSocket.readLine();
            System.out.println("Server says: " + readLine);
        }finally{
            serverSocket.close();
        }

    }

    public static void main(String[] args){
        try{
            Client client = new Client();
            client.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
