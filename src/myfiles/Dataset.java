package myfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dataset {
    public static void main(String[] args) {
        File dataset = new File("C:\\Users\\idaleksandra\\Desktop\\TestCmd\\dataset_91007.txt");
        int result = 0;
        try (Scanner scanner = new Scanner(dataset)) {
            while (scanner.hasNext()){
                int num = scanner.nextInt();
                if (num > result) result = num;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);


        //second file

        File dataset2 = new File("C:\\Users\\idaleksandra\\Desktop\\TestCmd\\dataset_91033.txt");
        int sum = 0;
        try (Scanner scanner = new Scanner(dataset2)) {
            while (scanner.hasNext()){
                sum += Integer.parseInt(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);

    }
}
