package be.intecbrussel.voorbeeld01;

// Dit is de superclass
public class Vehicle {

    // properties
    private String typeOfVehicle = "car";

    // methodes
    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }
    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void honk() {
        System.out.println("Toet toet!");
    }

}
