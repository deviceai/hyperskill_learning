package mygarbage;

public class GarbageTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

    }
}
