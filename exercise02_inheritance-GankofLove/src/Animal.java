// Oberklasse: Animal
public class Animal {

    // Felder der Superklasse
    // Diese Felder treffen auf alle Animals zukünftigen Animal zu
    public int age;
    public double weight;
    public String species;
    public String food;
    public String habitat;

    // Erster (Standard)Konstruktor
    public Animal(int age, double weight, String species, String food, String habitat) {
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.food = food;
        this.habitat = habitat;
    }

    // Zweiter Konstruktor
    public Animal() {
        this(0, 0.0, "Unbekannte Art", "Unbekanntes Futter", "Unbekannter Lebensraum");
    }

    public void sleep() {
        System.out.println("Zzzzz");
    }

    public void printAnimal() {
        System.out.println(age + " " + weight + " " + species + " " + food + " " + habitat);
    }
}