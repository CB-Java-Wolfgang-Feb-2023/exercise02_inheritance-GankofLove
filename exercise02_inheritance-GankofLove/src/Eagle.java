// Subclass2: Eagle
public class Eagle extends Bird {

    // Felder der zweiten Subklasse "Eagle"
    public String color;
    public double wingspan;

    // Erster (Standard)Konstruktor
    public Eagle(int age, double weight, String species, String food, String habitat, boolean canFly, String beakType, String color, double wingspan) {
        super(age, weight, species, food, habitat, canFly, beakType);
        this.color = color;
        this.wingspan = wingspan;
    }

    // Zweiter Konstruktor
    public Eagle() {
        super();
        this.color = "Braun";
        this.wingspan = 2.0;
    }

    // Überschreibt die Methode aus der Hauptklasse Animal (Methode: sleep)
    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping. Zzzzz");
    }

    // Überschreibt die Methode aus der Hauptklasse Animal (Methode: printAnimal)
    @Override
    public void printAnimal() {
        super.printAnimal();
        System.out.println(color + " " + wingspan);
    }
}