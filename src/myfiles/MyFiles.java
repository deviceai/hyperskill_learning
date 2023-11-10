package myfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyFiles {
    public static void main(String[] args) {
        File file = new File ("C:\\Users\\idaleksandra\\Desktop\\TestCmd\\Main.java");
//        System.out.println(file.exists());
//        System.out.println(new Date(file.lastModified()));
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
