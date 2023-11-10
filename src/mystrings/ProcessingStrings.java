package mystrings;

public class ProcessingStrings {
    public static void main(String[] args) {
        char[] someChars = {'A', 'B', 'C', 'D', 'E'};
        String someCharsToString = String.valueOf(someChars);
        System.out.println(someChars);
        System.out.println(someCharsToString);

        String text = "text";
        String[] textArray = text.split("");
        for (String s : textArray){
            System.out.println(s);
        }

        String str = "Hello, Java";

        int i = str.length() - 1;
        while (i >= 1) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
