// Oberklasse: Animal
public class Animal {

    // die Felder, welche alle Animals verbinden, werden in einer "Oberklasse" zusammengefasst.
    public int age;
    public double weight;
    public String species;
    public String food;
    public String habitat;

    // Konstruktor
    public   Animal(int age, double weight, String species, String food, String habitat) {
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.food = food;
        this.habitat = habitat;
    }

    // Methoden
    public void sleep() {
        System.out.println("Zzzzz");
    }

    public void printAnimal() {
        System.out.println(age + weight + species + food + habitat);
    }

}
