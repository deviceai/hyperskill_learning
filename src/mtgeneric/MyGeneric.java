package mtgeneric;

public class MyGeneric {
    public static void main(String[] args) {
        var obj1 = new GenericClass<>("Text");
        System.out.println(obj1.getT());

    }
}
 class GenericClass <T> {
    T t;

     public GenericClass(T t) {
         this.t = t;
     }

     public T getT() {
         return t;
     }

     public void setT(T t) {
         this.t = t;
     }
 }
