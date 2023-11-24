package mythreads;

public class SimpleMultithreadedProgram {
    public static void main(String[] args) {
        //Thread 1
        Thread worker = new SquareWorkerThread("squre-worker");
        worker.start();

        //Main thread
        for (long i = 0; i < 5_555_555_543L; i++) {
            if (i % 1_000_000_000 == 0) {
                System.out.println("Hello from the main thread!");
            }
        }

    }
}
