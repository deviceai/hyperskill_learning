package static_fields;

class StaticMembersTest {
    static final String TEXT = "Hello";

    int magic = 10;

    static void doSomething() {
        System.out.println(TEXT);

    }
@Deprecated
    void doDo() {
        System.out.println(TEXT);
        doSomething();
    }
}
public class StaticMembers {
    public static void main(String[] args) {

    }
}

