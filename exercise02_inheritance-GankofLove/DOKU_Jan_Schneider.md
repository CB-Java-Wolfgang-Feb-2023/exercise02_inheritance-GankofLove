# **Vererbung** - Inheritance

#`extends` #new

Vererbung ist ein grundlegendes Konzept der objektorientierten Programmierung, und es ist eine der Säulen, auf denen die objektorientierte Programmierung in Java und anderen OOP-Sprachen basiert.

Vererbung ermöglicht einer Klasse, Methoden und Eigenschaften von einer anderen Klasse zu erben. In diesem Kontext wird die Klasse, die erbt, als "Unterklasse" oder "abgeleitete Klasse" bezeichnet, und die Klasse, von der geerbt wird, wird als "Oberklasse" oder "Basisklasse" bezeichnet.

Vererbung wird in Java mit dem Schlüsselwort `extends` implementiert. Hier ist ein einfaches Beispiel:

```java
public class Fahrzeug {
    public void fahren() {
        System.out.println("Das Fahrzeug fährt");
    }
}

public class Auto extends Fahrzeug {
    public void hupen() {
        System.out.println("Das Auto hupt");
    }
}
```
In diesem Beispiel erbt die Klasse `Auto` von der Klasse `Fahrzeug`. Das bedeutet, dass ein `Auto`-Objekt sowohl die fahren Methode (geerbt von `Fahrzeug`) als auch die hupen Methode (definiert in `Auto`) aufrufen kann:

```java
Auto meinAuto = new Auto();
meinAuto.fahren(); // Das Fahrzeug fährt
meinAuto.hupen(); // Das Auto hupt
```

**WICHTIG:** Vererbung ist nützlich, um Code zu wiederverwenden und um eine natürliche Hierarchie zwischen Klassen zu erstellen, die die Realität modelliert.

In unserem Beispiel ist es sinnvoll, dass Auto von Fahrzeug erbt, weil ein Auto eine Art von Fahrzeug ist.

Es ist zu beachten, dass Java nur die "einfache Vererbung" unterstützt, was bedeutet, dass eine Klasse nur von einer einzigen Oberklasse erben kann. Wenn Sie eine Klasse erstellen möchten, die von mehreren Klassen erbt, können Sie stattdessen Interfaces verwenden, was einer "mehrfachen Vererbung" ähnelt.


<br>

---

## **Typen und Sub-Typen**

Ein Typ steht in diesem Zusammenhang für die Mutterklasse. Die Sub-Typen Stehen für Folge-Klassen. In der OOP hängen die Klassen zusammen. Die Mutterklasse/Oberklasse ist quasi das Fundament und die Folgeklassen sind die Erweiterungen.

Typen und Subtypen in Java beziehen sich auf Klassen und ihre Beziehungen zueinander, insbesondere in Bezug auf das Konzept der Vererbung.

In Java, wenn eine Klasse von einer anderen Klasse erbt, wird die abgeleitete Klasse als "Subtyp" oder "Unterklasse" bezeichnet und die Basisklasse als "Supertyp" oder "Oberklasse".

Das bedeutet, dass ein Subtyp alle Attribute und Methoden seines Supertyps erbt. Ein Subtyp kann jedoch auch zusätzliche Attribute und Methoden haben, die nicht im Supertyp vorhanden sind.

---

<br>

## **Die Klasse Object**

In Java ist Object die Mutter aller Klassen und steht in der Vererbungshirachie immer ganz oben. Jede Klasse, die in Java definiert wird, ist entweder direkt oder indirekt von der Object Klasse (erbt) abgeleitet. Das heißt, alle Objekte (einschließlich Arrays), erben Methoden aus der Object Klasse.

Die Object Klasse ist Teil des java.lang Pakets. Sie definiert mehrere Methoden, die für alle Java-Klassen gelten:

public final Class<?> getClass(): Diese Methode gibt die Laufzeitklasse des Objekts zurück. Sie kann verwendet werden, um Metainformationen über die Klasse zu erhalten.

public int hashCode(): Gibt den Hashcode-Wert des Objekts zurück. Standardmäßig wandelt diese Methode die interne Adresse des Objekts in einen ganzzahligen Hashcode um.

public boolean equals(Object obj): Vergleicht dieses Objekt mit dem angegebenen Objekt. Die genaue Logik des Vergleichs kann von der überschreibenden Klasse definiert werden.

public String toString(): Gibt eine Zeichenkette zurück, die das Objekt darstellt. Kann in Klassen überschrieben werden, um eine nützlichere Darstellung zu liefern.

public final void notify(), public final void notifyAll(), und public final void wait(long timeout) sind Methoden, die für die Thread-Koordination verwendet werden können.

protected Object clone() throws CloneNotSupportedException: Erzeugt und gibt eine Kopie des Objekts zurück.
protected void finalize() throws Throwable: Diese Methode wird aufgerufen, bevor ein Objekt endgültig zerstört wird. Sie kann überschrieben werden, um Aufräumarbeiten durchzuführen.

Das Verständnis dieser Methoden und ihrer Anwendungen kann beim Design und der Implementierung von Klassen in Java sehr hilfreich sein. Sie erlauben eine erhebliche Menge an Wiederverwendbarkeit und Flexibilität in Java-Code.

<br>

--- 

## **Direkte Vererbung VS Indirekte Vererbung**

In Java werden Klassen durch eine Hierarchie definiert, die auf der Vererbung basiert. Die Vererbung kann in zwei Typen unterteilt werden: direkte Vererbung und indirekte Vererbung.

**Direkte Vererbung:** Wenn eine Klasse von einer anderen Klasse erbt, wird dies als direkte Vererbung bezeichnet. In diesem Fall ist die ersteren Klasse die Unterklasse oder abgeleitete Klasse, und die letztere Klasse ist die Oberklasse oder Basisklasse. Hier ein einfaches Beispiel:

```java
class Base {
    // Eigenschaften und Methoden der Basisklasse
}

class Derived extends Base {
    // Eigenschaften und Methoden der abgeleiteten Klasse
}
```
In diesem Fall erbt die Klasse "Derived" direkt von der Klasse "Base".

**Indirekte Vererbung:** Indirekte Vererbung bezieht sich auf den Fall, in dem eine Klasse von einer anderen Klasse erbt, die selbst von einer weiteren Klasse erbt. Dies bildet eine Vererbungskette oder eine Hierarchie. Hier ist ein einfaches Beispiel:

```java
class Grandparent {
    // Eigenschaften und Methoden der Großelterklasse
}

class Parent extends Grandparent {
    // Eigenschaften und Methoden der Elternklasse
}

class Child extends Parent {
    // Eigenschaften und Methoden der Kindklasse
}
```

In diesem Fall erbt die Klasse Child indirekt von der Klasse Grandparent durch die Klasse Parent.

Es ist wichtig zu beachten, dass Java nur einfache Vererbung unterstützt, d.h. eine Klasse kann nur von einer anderen Klasse erben. Allerdings können Interfaces verwendet werden, um eine Art von Mehrfachvererbung zu erreichen.


<br>

--- 

## **Mehrfachvererbung**

Mehrfachvererbung meint, dass eine Klasse von mehr als einer anderen Klasse abgeleitet werden kann. Dies ist zb. in C++ oder Python, aber NICHT in Java möglich!

### **Warum?**
Dealdly Diamond of Death - @Override Probleme.

<br>

---

## **`final`**

Das Schlüsselwort final in Java kann in verschiedenen Kontexten verwendet werden:
* `final` und Variabelm
* `final` und Methoden
* `final` und Klassen

<br>

---

### **`final` im Bezug auf Variabeln**

In Java, wenn Sie das final Schlüsselwort mit einer Variablen verwenden, wird die Variable zu einer Konstanten gemacht. Nachdem die Variable einmal initialisiert wurde, kann ihr Wert nicht mehr geändert werden. Wenn Sie versuchen, den Wert einer final Variablen zu ändern, führt dies zu einem Kompilierfehler.

Das final Schlüsselwort kann mit allen Arten von Variablen verwendet werden, einschließlich Instanzvariablen, Klassenvariablen (static Variablen) und lokalen Variablen.

Hier sind einige Beispiele:

Final Instanzvariable:

```java
public class MyClass {
    final int myFinalVariable = 10;  // Instanzvariable
}
```

In diesem Fall ist myFinalVariable eine final Instanzvariable. Ihr Wert wird beim Erzeugen eines Objekts von MyClass festgelegt und kann danach nicht mehr geändert werden.

Final Klassenvariable (static Variable):

```java
public class MyClass {
    static final int myFinalVariable = 10;  // Klassenvariable
}
```
Hier ist myFinalVariable eine final Klassenvariable (auch als static Variable bekannt). Ihr Wert wird festgelegt, wenn die Klasse geladen wird, und kann danach nicht mehr geändert werden.

Final lokale Variable:

```java
public class MyClass {
    void myMethod() {
        final int myFinalVariable = 10;  // Lokale Variable
        myFinalVariable = 20;  // Kompilierfehler
    }
}
```

In diesem Beispiel ist myFinalVariable eine final lokale Variable innerhalb der Methode myMethod. Ihr Wert wird bei der Ausführung der Methode festgelegt und kann danach nicht mehr geändert werden.

Das final Schlüsselwort ist besonders nützlich, wenn Sie eine Variable haben, deren Wert nicht geändert werden soll. Es verbessert die Lesbarkeit des Codes und hilft bei der Fehlervermeidung, indem es verhindert, dass der Wert der Variablen versehentlich geändert wird.

<br>

---

### **`final` im Bezug auf Methoden**

In Java bedeutet die final-Deklaration vor einer Methode, dass diese Methode nicht in einer Unterklasse überschrieben werden kann. Das heißt, einmal definiert und als final markiert, bleibt das Verhalten dieser Methode unveränderlich für alle Klassen, die sie erben. Dies wird oft verwendet, um eine bestimmte Implementierung oder ein bestimmtes Verhalten einer Methode zu sichern und sicherzustellen, dass es durch Unterklassen nicht geändert wird.

Hier ist ein einfaches Beispiel:

```java
public class Superclass {
    // Eine final Methode
    public final void showFinal() {
        System.out.println("Diese Methode ist final und kann nicht überschrieben werden.");
    }
}

public class Subclass extends Superclass {
    // Versuch, eine final Methode zu überschreiben
    public void showFinal() {  // Compiler-Fehler
        System.out.println("Versuch, eine final Methode zu überschreiben.");
    }
}
```
In diesem Beispiel erzeugt der Versuch, die final Methode showFinal in der Subclass zu überschreiben, einen Compiler-Fehler.

final Methoden sind ein Instrument zur Verbesserung der Sicherheit und Vorhersehbarkeit von Code. Durch das Verhindern des Überschreibens einer Methode kann sichergestellt werden, dass alle Instanzen einer Klasse, unabhängig von ihrer tatsächlichen Typ (d.h., ob sie eine Instanz der Superklasse oder einer ihrer Subklassen sind), das gleiche Verhalten aufweisen, wenn diese Methode aufgerufen wird. Dies kann dazu beitragen, unerwartete Bugs und Verhaltensweisen zu vermeiden.

<br>

---

### **`final` im Bezug auf Klassen**

In Java kann das final-Schlüsselwort auch auf Klassen und Methoden angewendet werden. Hier ist, was es in Bezug auf Klassen bedeutet:

Final Klassen:

Wenn Sie eine Klasse als final deklarieren, bedeutet das, dass diese Klasse nicht vererbt werden kann. In anderen Worten, keine andere Klasse kann diese final Klasse erweitern.

Zum Beispiel:

```java
final class FinalClass {
    // Klassenkörper
}

class SomeClass extends FinalClass {  // Compiler-Fehler
    // Klassenkörper
}
```
In diesem Beispiel haben wir versucht, die FinalClass zu erweitern, was zu einem Compiler-Fehler führt, da FinalClass als final deklariert ist.

Die Verwendung des final Schlüsselworts auf einer Klasse ist nützlich, wenn Sie sicherstellen möchten, dass die Klasse nicht erweitert werden kann, um die Integrität und/oder die Unveränderlichkeit der Klasse zu gewährleisten. Beispielsweise ist in Java die String Klasse final, um ihre Unveränderlichkeit zu gewährleisten.

Es ist jedoch wichtig zu beachten, dass das Markieren einer Klasse als final die Flexibilität und Wiederverwendbarkeit des Codes einschränken kann, da die Klassenerweiterung eine der Haupttechniken der objektorientierten Programmierung ist. Daher sollte es mit Bedacht eingesetzt werden.

<br>


## `@Override`

(nicht zu verwechseln: Überladen/Overload//Überschreiben/Override in Java)

In Java bezeichnet "Override" oder "Überschreiben" das Konzept, eine Methode in einer Unterklasse zu definieren, die bereits in der übergeordneten Klasse definiert ist. Dies ermöglicht es, die Implementierung der Methode in der Unterklasse anzupassen oder zu erweitern, ohne den Methodennamen zu ändern.

Hier ist ein einfaches Beispiel für das Überschreiben von Methoden in Java:

```java
class Tier {
    // Methode in der übergeordneten Klasse
    void essen() {
        System.out.println("Das Tier isst.");
    }
}

class Hund extends Tier {
    // Überschriebene Methode in der Unterklasse
    @Override
    void essen() {
        System.out.println("Der Hund isst Hundefutter.");
    }
}

public class OverrideBeispiel {
    public static void main(String[] args) {
        Tier meinTier = new Hund();
        meinTier.essen();  // Ruft die überschriebene Methode im Hund-Objekt auf
    }
}
```

In diesem Beispiel gibt es eine essen() Methode in der Tier Klasse. In der Hund Klasse, die von der Tier Klasse erbt, wird die essen() Methode überschrieben. Das Schlüsselwort @Override ist eine Annotation, die den Compiler anweist, zu überprüfen, ob die Methode tatsächlich eine Methode in der übergeordneten Klasse überschreibt. Wenn es keine passende Methode in der übergeordneten Klasse gibt, wird ein Kompilierfehler ausgelöst.

Wenn Sie ein Hund Objekt erstellen und die essen() Methode aufrufen, wird die überschriebene essen() Methode der Hund Klasse und nicht die Methode der Tier Klasse aufgerufen.

Das Überschreiben von Methoden ist ein Kernkonzept der objektorientierten Programmierung und wird verwendet, um Polymorphismus zu implementieren. Es ermöglicht, dass ein Objekt in vielen Formen erscheinen kann - ein Objekt einer Unterklasse kann als Objekt der übergeordneten Klasse behandelt werden, und die Implementierung der Methoden der Unterklasse wird ausgeführt, wenn sie aufgerufen wird.