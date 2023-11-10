package myfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\idaleksandra\\Desktop\\TestCmd\\fileToWrite.txt");
        System.out.println(file.exists());

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("test line 1");
            fileWriter.write("test line 2");
            fileWriter.close();

        PrintWriter filePrint = new PrintWriter(file);
        filePrint.println("printed line 3");
        filePrint.close();
    }
}
