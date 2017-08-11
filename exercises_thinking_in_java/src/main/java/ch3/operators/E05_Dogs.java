package ch3.operators;

/**
 * Create a class called Dog containing two Strings: name and says.
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
 * Then display their names and what they say.
 *
 * @author Andrey Koba)
 */

public class E05_Dogs {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";

        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";

        System.out.println("d1 name - " + d1.name + " and says - " + d1.says);
        System.out.println("d2 name - " + d2.name + " and says - " + d2.says);
    }
}
class Dog {
    String name, says;
}