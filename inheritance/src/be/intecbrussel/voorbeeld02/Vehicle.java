package be.intecbrussel.voorbeeld02;

public class Vehicle {

    private String typeOfVehicle;
    // This will be executed second

    public Vehicle() {
        //this("Car");
        System.out.println("Vehicle class no-args constructor");
    }

    // This will be executed first
    public Vehicle(String typeOfVehicle) {
        //this();
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Constructor Vehicle met parameters");
    }

}
