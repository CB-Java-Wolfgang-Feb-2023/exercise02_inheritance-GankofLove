// Unterklasse von Animal: Fish
public class Fish extends Animal {


    //Konstruktor
    public Fish(int age, double weight, String species, String food, String habitat) {
        super(age, weight, species, food, habitat);
    }

    // Spezifische Methoden: Fish
    public void soundSignature() {
        System.out.println("Blub.");
    }



}
