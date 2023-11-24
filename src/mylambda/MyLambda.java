package mylambda;

import java.util.SortedSet;
import java.util.function.Function;

public class MyLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> adder1 = (x) ->{
            x = x*2;
            x += 8;
            return x;
        };
        Integer result =  adder1.apply(5);
        System.out.println(result);

        Function<String, Integer> f = s -> s.length();
        printResultLambda(f);

        //printResultLambda(Function<String, Integer> p = s -> s.l );

        final int num = 100;
        Function<Integer, Integer> adder100 = x -> x + num;
        System.out.println(adder100.apply(125));
        //num += 1;
        System.out.println(adder100.apply(125));
    }

    private static void printResultLambda(Function<String, Integer> function){
        System.out.print("Length is: ");
        System.out.println(function.apply("LAMBDA PRINT"));
    }
}
