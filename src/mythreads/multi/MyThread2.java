package mythreads.multi;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread2 msg");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
