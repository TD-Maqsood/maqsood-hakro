import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Server {
    public static void main(String args[]) throws IOException {

        try {
            System.out.println("Server Program is running...");
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            Scanner sc= new Scanner(System.in);
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);


            String serverConnected = "Server connected successfully. Welcome to the guessing number game. You have six chances to guess the number in order to win the game. Let's start and guess any number...";
            dataOutputStream.writeUTF(serverConnected);








            //receiving message
            String message = (String) dataInputStream.readUTF();
            System.out.println("Client: " + message);

            //Sending message
            System.out.print("Server: ");
            String str= sc.nextLine();
            dataOutputStream.writeUTF(str);



            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}