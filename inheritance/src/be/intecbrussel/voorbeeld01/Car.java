package be.intecbrussel.voorbeeld01;

public class Car extends Vehicle {

    // met keyword extends geven we aan welke klas de superklas word.
    // Als we dit doen hebben we de mogelijkheid om properties en methodes
    // te gebruiken. die niet gemarkeerd zijn als private.
    // Access modifier private is alleen voor die klas.
    // Vehicle is super class
    // Car is sub class

    // properties
    private String brandName = "Audi";

    // getter
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    // Vehicle class methode
    public void honk() {
        System.out.println("Tuut tuut!");
    }

    public void sound() {
        // Roept de honk() method van Vehicle
        // keyword super geeft aan dat ik de methode wil van
        // de superklas
        super.honk();
        Bike bike = new Bike();
        bike.honk();
        // honk methode van de car class
        //honk();
    }

}
