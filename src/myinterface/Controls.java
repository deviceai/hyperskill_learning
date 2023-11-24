package myinterface;

public interface Controls {
    final static int COSNTPOWER = 85;
    static void showConstPower(){
        System.out.println("Const power is: " + COSNTPOWER);
    }
    default void move(){
        System.out.println("def method");
    }

    private void privateMethod(){

    }
}
