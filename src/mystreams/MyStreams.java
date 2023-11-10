package mystreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyStreams {
    public static void main(String[] args) {
        //byte streams
        //Scanner scanner = new Scanner(System.in);

        //char streams (16-bit unicode data)
        //FileReader reader = new FileReader("file.txt");
        //buffered streams   - to temporary location (byte or char array - buffer)

        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\idaleksandra\\Desktop\\TestCmd\\file.txt");

            byte[] bytes = new byte[5];
            int numberOfBytes = inputStream.read(bytes);
            System.out.println(numberOfBytes);
            inputStream.close();

        } catch (IOException e){
            System.out.println("File not exist!");
        }
    }
}
