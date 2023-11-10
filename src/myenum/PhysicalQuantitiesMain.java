package myenum;

public class PhysicalQuantitiesMain {
    public static void main(String[] args) {
        PhysicalQuantities massQuantity = PhysicalQuantities.KG;
        System.out.println(massQuantity);
        System.out.println(massQuantity.getQuantityName());
        System.out.println(PhysicalQuantities.findByQuantityName("mass"));

    }
}
