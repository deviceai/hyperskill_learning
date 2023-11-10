package myexception;

import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws MyCustomException{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0){
            throw new MyCustomException("Number is below zero!");
        }
        else {
            System.out.println("Number is " + num);
        }

    }
}

class MyCustomException extends Exception {
    public MyCustomException(String msg){
        super(msg);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }
}
