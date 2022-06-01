import java.io.*;
import java.net.*;
import java.util.*;

public class C {
    public static void main(String args[]) {
        try {
            System.out.println("Client Program is running...");
            Socket socket = new Socket("localhost", 6666);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);


            String serverConnected = (String) dataInputStream.readUTF();
            System.out.println(serverConnected);


            int counter = 0;
            for (int i = 0; i < 6; i++) {
                //sending message
                System.out.print("Client: ");
                String str = sc.nextLine();
                dataOutputStream.writeUTF(str);

                //receiving message
                String message = (String) dataInputStream.readUTF();
                System.out.println("Server: " + message);


                System.out.println("Qiang");


                if (message.equals("Congratulations! you won the match.")) {
                    break;

                }

                counter++;

            }

            if (counter == 6) {
                System.out.println("Sorry, you lost the game");
            }

            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}