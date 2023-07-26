import java.math.BigDecimal;

public class TypesExpressions {

    public static void main(String[] args) {
        System.out.printf("byte minimum= %s, maximum= %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum= %s, maximum= %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("int minimum= %s, maximum= %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long minimum= %s, maximum= %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float minimum= %s, maximum= %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum= %s, maximum= %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = (float) 123.456789012345678F;
        double d = 123.456789012345678;

        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);
        System.out.println("f is " + f);
        System.out.println("d is " + d);
        BigDecimal z = new BigDecimal("123.456789011234567890123456789012345678");
        System.out.printf("z is %.99f %n, z");

        double result1 = 0.1 * 7;
        double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1 is %.99f %n", result1);
        System.out.printf("result2 is %.99f %n", result2);

        double difference = result1 - result2;
        System.out.printf("The difference is %.99f %n", difference);

        boolean checkResult1 = result1 - result2 == 0;

        int apples = 18;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;

        boolean moreApples;
        boolean applesAreDearer;

        moreApples = (apples > oranges);
        applesAreDearer = (applePrice > orangePrice);
        System.out.printf("We have more apples: %s %n", moreApples);
        System.out.printf("Apples are dearer: %s %n", applesAreDearer);


        System.out.println(apples == oranges);
        System.out.println(apples != oranges);

        System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
        System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
        System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
        System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);
        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) && (applePrice > orangePrice));


        boolean moreApplesAndDearer = moreApples && applesAreDearer;
        boolean moreApplesOrDearer = moreApples || applesAreDearer;
        System.out.printf("Reducing cost of apples: %s %n", moreApplesAndDearer);
        System.out.printf("Reducing cost of apples: %s %n", moreApplesOrDearer);


    }
}