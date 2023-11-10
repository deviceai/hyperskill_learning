package super_sub_class;

public class SubClass extends SuperClass{

    protected int field;

    public SubClass (){
        this.field = 30;
        super.field = 20;
    }

    public void printSubValue(){
        super.printBaseValue();
        System.out.println(field);
    }
}
