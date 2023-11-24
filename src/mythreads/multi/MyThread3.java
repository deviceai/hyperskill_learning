package mythreads.multi;

public class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread3 msg");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
