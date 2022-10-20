package be.intecbrussel.voorbeeld02;

// sub klas van Vehicle(super klas)
public class Car extends Vehicle {

    /*
    *Dit zal niet worden uitgevoerd. Als we de this() uit comment halen en de
   ander in comment zetten in de
    * Vehicle class kun je het veerschil zien. Vergeet niet dat er altijd 1
   constructor zonder een this() moet zijn.
    */
    public Car() {
        System.out.println("No args constructor Car");
    }

    // This will be executed third
    Car(String typeOfVehicle) {
        super(typeOfVehicle);
        System.out.println("Car constructor");
    }

}
