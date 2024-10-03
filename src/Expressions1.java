package P0part2;

public class Expressions1 {
    public static final float EPSILON = 0.000001f;
    public static void main(String[] args) {
        int a, b, c, d, e, i;
        double x, z, u, f, g, h;
        boolean son_iguals_f, son_iguals_d;
        char character1 = 'p', character2, character3='P';

        a = 9 / 3 + 2;
        b = 3 * 20 / 7;
        c = 3 / 5 * 7;
        System.out.println("a=" + a + "b=" + b + "c=" + c);

        z = 10e3;
        u = 10e-3;
        x = 1000 * (2 / 4 + 1 / 3 - 1);
        System.out.println("z=" + z + " u=" + u + " x=" + x);

        b = b + 1 / b;
        x = 1 / x;
        a = (int) x;
        z = 1. / a;
        System.out.println("b=" + b + " x=" + x + " a=" + a + " z=" + z);

        a = 50 % b;
        b = 614 % 10;
        c = 57 % 10;
        d = 5 % 10;
       // e = 1 / 0;
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=");

        f = 0.0f;
        f += 0.02f;
        f += 0.03f;
        son_iguals_f = f == 0.05f;
        System.out.println("son_iguals_f = " + son_iguals_f);

        son_iguals_f = Math.abs(f - 0.05f) < EPSILON;
        System.out.println("son_iguals_f = " + son_iguals_f);
        g = 1.000001;
        h = 0.000001;
        son_iguals_d = (g-h) == 1.0;
        System.out.println("son_iguals_d = " + son_iguals_d);

        son_iguals_d = Math.abs((g-h) - 1.0) < EPSILON;
        System.out.println("son_iguals_d = " + son_iguals_d);

        System.out.println("character1 = " + character1 + "codi= " + (int) character1);
        character2 = (char) (character1 + 1);

        System.out.println("character2 = " + character2 + "codi= " + (int) character2);
        i = character2 + 1;
        System.out.println("i=" + i + " i= " + (char) i);
        System.out.println("character3 = " + character3 + "codi= " + (int) character3);
    }
}
