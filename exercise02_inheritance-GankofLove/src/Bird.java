// Subclas1: Bird
public class Bird extends Animal {

    // Felder der ersten Subklasse "Bird"
    public boolean canFly;
    public String beakType;

    // Erster Konstruktor
    public Bird(int age, double weight, String species, String food, String habitat, boolean canFly, String beakType) {
        super(age, weight, species, food, habitat);
        this.canFly = canFly;
        this.beakType = beakType;
    }

    // Zweiter Konstruktor
    public Bird() {
        super();
        this.canFly = true;
        this.beakType = "Unbekannt";
    }
    // Überschreibt die Methode aus der Hauptklasse Animal (Methode: sleep)
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping. Zzzzz");
    }

    // Überschreibt die Methode aus der Hauptklasse Animal (Methode: printAnimal)
    @Override
    public void printAnimal() {
        super.printAnimal();
        System.out.println(canFly + " " + beakType);
    }
}