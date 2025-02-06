import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client{

    public Runnable getRunnable() throws Exception{
        return new Runnable() {
            @Override
            public void run() {
                int PORT = 8080;
                try {
                    InetAddress serverAddress = InetAddress.getByName("localhost");
                    try (Socket serverSocket = new Socket(serverAddress, PORT);
                         PrintWriter toServerSocket = new PrintWriter(serverSocket.getOutputStream(), true);
                         BufferedReader fromServerSocket = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()))) {
                        
                        toServerSocket.println("Hello Server, I am client"); 
                        String readLine = fromServerSocket.readLine();
                        System.out.println("Server says: " + readLine);
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args){
        Client client = new Client();

        for(int i = 0; i < 100; i++){
            try{
                Thread thread = new Thread(client.getRunnable());
                thread.start();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
