import java.util.Random;

public class App {
    /*
        Napisz program, który wylosuje współrzędne punktu w układzie współrzędnych.
        Wartości współrzędnych to liczby całkowite losowane z przedziału <10, 99>.
        Zakładając, że punkt należy do brzegu pewnego koła, którego środek znajduje
        się w początku układu współrzędnych, aplikacja wyznacza pole i obwód tego koła.
    */

    static int drawIntNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Draw range is not correct");
        }
        return new Random().nextInt(min, max + 1);
    }

    static double getZeroDistance(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    static double getCircleArea(int x, int y) {
        return Math.PI * Math.pow(getZeroDistance(x, y), 2);
    }

    static double getCircleCircumference(int x, int y) {
        return 2 * Math.PI * getZeroDistance(x, y);
    }

    public static void main(String[] args) {
        final var MIN = 10;
        final var MAX = 99;

        var x = 1; // drawIntNumber(MIN, MAX);
        var y = 1; // drawIntNumber(MIN, MAX);

        System.out.printf("""
Point:         [%d, %d]
Distance:      %.2f
Area:          %.2f
Circumference: %.2f
""", x, y, getZeroDistance(x, y), getCircleArea(x, y), getCircleCircumference(x, y));
    }
}
