package myenum;

public enum PhysicalQuantities {
    M("length"),
    KG("mass"),
    S("time");

    private final String quantityName;

    PhysicalQuantities(String quantityName) {
        this.quantityName = quantityName;
    }

    public String getQuantityName(){
        return quantityName;
    }

    public static PhysicalQuantities findByQuantityName(String name){
        for (PhysicalQuantities value: values()){
            if (value.getQuantityName() == name){
                return value;
            }
        }
        return null;
    }
}
