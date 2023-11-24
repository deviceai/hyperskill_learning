package myinterface;

public class Robot implements Controls{
    @Override
    public void move() {
        System.out.println("Im moving..");
    }

    public static void main(String[] args) {
        Controls controls = new Robot();
        controls.move();
        System.out.println(controls.COSNTPOWER);
    }
}
