public class Operators {


    public static void main(String[] args) {

        int answer = (7 + 3) * 4;
        System.out.println(answer);


        int x = 3;
        int y = x++;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);

        x = 3;
        y = ++x;
        System.out.printf("Using ++x, x is %s and y is %s.%n", x, y);

        System.out.println("Don't do this!");
        x = 3;
        y = ++x - x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);

        x = 3;
        y = x++ - ++x;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);

        int g = 3;
        int s = g++;
        int h = g;
      //  g++;
        System.out.printf("Using g++, g is %s and s is %s.%n", g, s);
        // Using x++, x is 4 and y is 3.

        g = 3;
        s = ++x;
        g++;
        g = s;
        System.out.printf("Using ++g, g is %s and s is %s.%n", g, s);
        // Using ++x, x is 4 and y is 4.

        System.out.println("Don't do this!");
        x = 3;
//        y = ++x - x++;
        x++;
        int z = x;
        y = z - x;  // or just y = 0;
        x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);
        // ++x - x++ gives: x is 5 and y is 0

        x = 3;
//        y = x++ - ++x;
        z = x;
        x += 2;
        y = z - x;  // or just y = -2;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);
        // x++ - ++x gives: x is 5 and y is -2*/



        double a = 12 * 3 / 4;
        double b = (12 * 3) / 4;
        double c = 12 * (3 / 4);
        System.out.printf("%s %s %s %n", a, b, c);
        System.out.println();

        double d = 12.0 / 3.0 / 4.0;
        double e = (12.0 / 3.0) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", d, e, f);
        System.out.println();

        int r = 12 + 3 * 4;
        int q = (12 + 3) * 4;
        int l = 12 + (3 * 4);
        System.out.printf("%s %s %s %n", r, q, l);

    }
}

