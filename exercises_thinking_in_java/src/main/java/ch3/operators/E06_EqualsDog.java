package ch3.operators;

public class E06_EqualsDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";

        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";

        Dog d3 = d2;

        System.out.println("d1 == d2 - " + (d1 == d2));
        System.out.println("d1 equals() d2 - " + d1.equals(d2));
        System.out.println("d2 equals() d3 - " + d2.equals(d3));
        System.out.println("d2 == d3 - " + (d2 == d3));
    }
}
