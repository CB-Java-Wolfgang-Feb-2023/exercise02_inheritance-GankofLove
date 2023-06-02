// Unterklasse von Animal: Lion
public class Lion extends Animal {

    //Konstruktor
    public Lion(int age, double weight, String species, String food, String habitat) {
        super(age, weight, species, food, habitat);
    }

    // Spezifischen Methoden: Lion
    public void soundSignature() {
        System.out.println("Roarrr!");
    }

}
