// Hauptklasse zum Testen
public class Main {

    // Hauptmethode: Erstellung von neuen Objekten der Klassen: Animal, Bird und Eagle mit spezifischen Feldern
    public static void main(String[] args) {
        Animal animal = new Animal(5, 20.0, "Kangaroo, ", "Grass, ", "Australia");
        Bird bird = new Bird(3, 1.5, "Parrot, ", "Seeds, ", "Jungle, ", true, "Curved");
        Eagle eagle = new Eagle(7, 5.0, "Bald Eagle, ", "Fish, ", "North America, ", true, "Hooked, ", "White and Brown", 2.3);

        // Ruft die printAnimal() Methode für jedes Objekt auf, um die Attribute zu printen
        animal.printAnimal();
        bird.printAnimal();
        eagle.printAnimal();

        // Polymorphismus: Erstellt ein Animal-Referenzobjekt, aber ein Eagle-Instanzobjekt
        Animal a = new Eagle(6, 4.5, "Golden Eagle", "Rodents", "Mountains", true, "Sharp", "Brown", 2.1);
        // Ruft die überschriebene sleep() Methode der Eagle-Klasse auf, obwohl die Referenz vom Typ Animal ist
        a.sleep();
    }
}
