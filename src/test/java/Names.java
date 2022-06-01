
import java.util.Random;
import java.net.*;
import java.io.*;
public class Names {



    public static void main(String args[]) throws IOException {

        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        try {
            OutputStream outputStream=socket.getOutputStream();
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("\n\nhello word\n\n");
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
