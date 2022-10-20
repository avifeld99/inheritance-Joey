package be.intecbrussel.voorbeeld01;

public class MainApp {

    public static void main(String[] args) {

        Car car = new Car();
//        System.out.println("Brandname: " + car.getBrandName() +
//                " Type of vehicle " + car.getTypeOfVehicle());
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();

//        vehicle.honk();
//        bike.honk();
//        car.honk();
//
//        bike.sound();
        car.sound();

    }

}
