package lab3;

import static java.lang.System.out;

public class Lab3 {

    private static int y(int b, int d) {
        return 3 + b - 2 * d;
    }

    private static int z(int y, int a, int b, int c, int d) {
        return switch (y) {
            case 7 -> 8 - c;
            case 11 -> 2 * a;
            case 12 -> 10 * d;
            case 22 -> 7 * b;
            default -> y;
        };
    }

    public static void main(String[] args) {
        out.println("Введіть чотири довільні числа");
        Reader Lab3Reader = new Reader();

        final int a = Lab3Reader.readInt();
        final int b = Lab3Reader.readInt();
        final int c = Lab3Reader.readInt();
        final int d = Lab3Reader.readInt();

        out.println("Результати обчислень");
        int y = y(b, d);
        int z = z(y, a, b, c, d);
        out.println("y = " + y + " z = " + z);
    }
}
