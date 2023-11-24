package mythreads.multi;

public class MyMultiThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread1(), "my-thread-1");
        Thread t2 = new Thread(new MyThread2(), "my-thread-2");
        Thread t3 = new Thread(new MyThread3(), "my-thread-3");

        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();

    }
}
