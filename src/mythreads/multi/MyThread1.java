package mythreads.multi;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread1 msg");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
