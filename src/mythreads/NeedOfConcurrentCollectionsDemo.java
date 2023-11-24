package mythreads;

import java.util.ArrayList;

public class NeedOfConcurrentCollectionsDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        Thread writer = new Thread(() -> addNumbers(numbers));
        writer.start();
        addNumbers(numbers);  //from main thread
        writer.join();
        System.out.println(numbers.size());

    }

    private static void addNumbers(ArrayList<Integer> target) {   //add synchronized
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
}
