package WithStrategyPattern;

public class Main {
    public static void main (String[] args) {
        // Here the constructor of SportsVehicle will be called where the object of Sportsvehicle will be assigned to
        // Vehicle refernce and then we will call drive() method which will internally go
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
