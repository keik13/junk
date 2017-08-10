package ch2.EverythingIsanObject;

/**
 * Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
 *
 * @author Andrey Koba)
 */

public class E11_AllTheColorsOfTheRainbow {
    public static void main(String[] args) {
        new AllTheColorsOfTheRainbow().changeTheHueOfTheColor(31);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}
