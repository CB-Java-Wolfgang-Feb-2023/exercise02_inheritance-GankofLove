// Unterklasse von Animal: Eagle
public class Eagle extends Animal {

    //Konstruktor
    public Eagle(int age, double weight, String species, String food, String habitat) {
        super(age, weight, species, food, habitat);
    }

    // Spezifische Methoden: Eagle
    public void SoundSignature() {
        System.out.println("iiiIIIIIi");
    }

}
