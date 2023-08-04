public class Logical2 {

    public static void main(String[] args) {
        System.out.println(inOrderEqual(2, 5, 11, false)); // Output: true
        System.out.println(inOrderEqual(5, 7, 6, false)); // Output: false
        System.out.println(inOrderEqual(5, 5, 7, true));  // Output: true

        System.out.println(lastDigit(23, 19, 13)); // Output: true
        System.out.println(lastDigit(23, 19, 12)); // Output: false
        System.out.println(lastDigit(23, 19, 3));  // Output: true

        System.out.println(in1To10(5, false));  // Output: true
        System.out.println(in1To10(11, false)); // Output: false
        System.out.println(in1To10(11, true));  // Output: true

        System.out.println(old35(3));  // Output: true
        System.out.println(old35(10)); // Output: true
        System.out.println(old35(15)); // Output: false


        System.out.println(fizzString("fig")); // Output: "Fizz"
        System.out.println(fizzString("dib")); // Output: "Buzz"
        System.out.println(fizzString("fib")); // Output: "FizzBuzz"


        System.out.println(twoAsOne(1, 2, 3)); // Output: true
        System.out.println(twoAsOne(3, 1, 2)); // Output: true
        System.out.println(twoAsOne(3, 2, 2)); // Output: false

        System.out.println(alarmClock(1, false)); // Output: "7:00"
        System.out.println(alarmClock(5, false)); // Output: "7:00"
        System.out.println(alarmClock(0, false)); // Output: "10:00"

        System.out.println(inOrder(1, 2, 4, false)); // Output: true
        System.out.println(inOrder(1, 2, 1, false)); // Output: false
        System.out.println(inOrder(1, 1, 2, true));  // Output: true

        System.out.println(love6(6, 4)); // Output: true
        System.out.println(love6(4, 5)); // Output: false
        System.out.println(love6(1, 5)); // Output: true

        System.out.println(withoutDoubles(2, 3, true)); // Output: 5
        System.out.println(withoutDoubles(3, 3, true)); // Output: 7
        System.out.println(withoutDoubles(3, 3, false)); // Output: 6

        System.out.println(maxMod5(2, 3)); // Output: 3
        System.out.println(maxMod5(6, 2)); // Output: 6
        System.out.println(maxMod5(3, 2)); // Output: 3

        System.out.println(withoutDoubles(2, 3, true)); // Output: 5
        System.out.println(withoutDoubles(3, 3, true)); // Output: 7
        System.out.println(withoutDoubles(3, 3, false)); // Output: 6

        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 3));


        System.out.println(redTicket(2, 2, 2)); // Output: 10
        System.out.println(redTicket(2, 2, 1)); // Output: 0
        System.out.println(redTicket(0, 0, 0)); // Output: 5

        System.out.println(greenTicket(1, 2, 3)); // Output: 0
        System.out.println(greenTicket(2, 2, 2)); // Output: 20
        System.out.println(greenTicket(1, 1, 2)); // Output: 10


        System.out.println(blueTicket(9, 1, 0)); // Output: 10
        System.out.println(blueTicket(9, 2, 0)); // Output: 0
        System.out.println(blueTicket(6, 1, 4)); // Output: 10

        System.out.println(shareDigit(12, 23)); // Output: true
        System.out.println(shareDigit(12, 43)); // Output: false
        System.out.println(shareDigit(12, 44)); // Output: false

        System.out.println(sumLimit(2, 3)); // Output: 5
        System.out.println(sumLimit(8, 3)); // Output: 8
        System.out.println(sumLimit(8, 1)); // Output: 9

        System.out.println(cigarParty(30, false)); // Output: false
        System.out.println(cigarParty(50, false)); // Output: true
        System.out.println(cigarParty(70, true));  // Output: true

        System.out.println(dateFashion(5, 10)); // Output: 2
        System.out.println(dateFashion(5, 2));  // Output: 0
        System.out.println(dateFashion(5, 5));  // Output: 1


        System.out.println(squirrelPlay(70, false)); // Output: true
        System.out.println(squirrelPlay(95, false)); // Output: false
        System.out.println(squirrelPlay(95, true));  // Output: true

        System.out.println(caughtSpeeding(60, false)); // Output: 0
        System.out.println(caughtSpeeding(65, false)); // Output: 1
        System.out.println(caughtSpeeding(65, true));  // Output: 0

        System.out.println(sortaSum(3, 4));   // Output: 7
        System.out.println(sortaSum(9, 4));   // Output: 20
        System.out.println(sortaSum(10, 11)); // Output: 21

        System.out.println(alarmClock(1, false)); // Output: "7:00"
        System.out.println(alarmClock(5, false)); // Output: "7:00"
        System.out.println(alarmClock(0, false)); // Output: "10:00"

        System.out.println(love6(6, 4)); // Output: true
        System.out.println(love6(4, 5)); // Output: false
        System.out.println(love6(1, 5)); // Output: true

        System.out.println(in1To10(5, false)); // Output: true
        System.out.println(in1To10(11, false)); // Output: false
        System.out.println(in1To10(11, true)); // Output: true

        System.out.println(specialEleven(22)); // Output: true
        System.out.println(specialEleven(23)); // Output: true
        System.out.println(specialEleven(24)); // Output: false

        System.out.println(more20(20)); // Output: false
        System.out.println(more20(21)); // Output: true
        System.out.println(more20(22)); // Output: true

        System.out.println(old35(3));  // Output: true
        System.out.println(old35(10)); // Output: true
        System.out.println(old35(15)); // Output: false

        System.out.println(less20(18)); // Output: true
        System.out.println(less20(19)); // Output: true
        System.out.println(less20(20)); // Output: false

        System.out.println(nearTen(12)); // Output: true
        System.out.println(nearTen(17)); // Output: false
        System.out.println(nearTen(19)); // Output: true

        System.out.println(teenSum(3, 4));  // Output: 7
        System.out.println(teenSum(10, 13)); // Output: 19
        System.out.println(teenSum(13, 2)); // Output: 19

        System.out.println(answerCell(false, false, false)); // Output: true
        System.out.println(answerCell(false, false, true));  // Output: false
        System.out.println(answerCell(true, false, false));  // Output: false

        System.out.println(teaParty(6, 8)); // Output: 1
        System.out.println(teaParty(3, 8)); // Output: 0
        System.out.println(teaParty(20, 6)); // Output: 2

        System.out.println(fizzString("fig")); // Output: "Fizz"
        System.out.println(fizzString("dib")); // Output: "Buzz"
        System.out.println(fizzString("fib")); // Output: "FizzBuzz"

        System.out.println(twoAsOne(1, 2, 3)); // Output: true
        System.out.println(twoAsOne(3, 1, 2)); // Output: true
        System.out.println(twoAsOne(3, 2, 2)); // Output: false


    }

    //inOrderEqual
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    //lastDigit

    public static boolean lastDigit(int a, int b, int c) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        return lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC;
    }

    //lessBy10
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            // If outsideMode is true, return true if n is less or equal to 1, or greater or equal to 10.
            return n <= 1 || n >= 10;
        } else {
            // If outsideMode is false, return true if n is in the range 1..10 (inclusive).
            return n >= 1 && n <= 10;
        }
    }


    //frizzString
    public static String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }


    //twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }


    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }


    //love6

    //withoutDoubles
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = (die1 % 6) + 1;
        }
        return die1 + die2;
    }


    //maxMod5
    public static int maxMod5(int a, int b) {

        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }

    }
//redTicket


    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    //greenTicket
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    //blueTicket
    public static int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;

        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        } else if (abSum - bcSum == 10 || abSum - acSum == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    //shareDigit
    public static boolean shareDigit(int a, int b) {
        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;

        return (leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB);
    }

    //sumLimit

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        String aString = String.valueOf(a);
        String sumString = String.valueOf(sum);

        if (sumString.length() == aString.length()) {
            return sum;
        } else {
            return a;
        }
    }

    //cigarParty
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

    //dateFashion
    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0; // You or your date has style of 2 or less, result is 0 (no).
        } else if (you >= 8 || date >= 8) {
            return 2; // You or your date is very stylish (8 or more), result is 2 (yes).
        } else {
            return 1; // Result is 1 (maybe).
        }
    }
//squirrelPlay

    public static boolean squirrelPlay(int temperature, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temperature >= 60 && temperature <= upperLimit;
    }

    //caughtSpeeding
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int limit = isBirthday ? 5 : 0;

        if (speed <= 60 + limit) {
            return 0; // Speed is 60 or less (with birthday bonus), result is 0 (no ticket).
        } else if (speed >= 61 + limit && speed <= 80 + limit) {
            return 1; // Speed is between 61 and 80 (with birthday bonus), result is 1 (small ticket).
        } else {
            return 2; // Speed is 81 or more (with birthday bonus), result is 2 (big ticket).
        }
    }

    //sortaSum
    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    //alarmClock
    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00"; // On weekdays (1 to 5), alarm should be "10:00".
            } else {
                return "off";   // On weekends (0 or 6), alarm should be "off".
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";  // On weekdays (1 to 5), alarm should be "7:00".
            } else {
                return "10:00"; // On weekends (0 or 6), alarm should be "10:00".
            }
        }
    }

    //love6
    public static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    //specialEleven
    public static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }


    //more20
    public static boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    //old35
    public static boolean old35(int n) {
        boolean multipleOf3 = n % 3 == 0;
        boolean multipleOf5 = n % 5 == 0;
        return (multipleOf3 || multipleOf5) && !(multipleOf3 && multipleOf5);
    }

    //less20
    public static boolean less20(int n) {
        return (n % 20 == 19 || n % 20 == 18);
    }

    //nearTen
    public static boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }

//teenSum


    public static int teenSum(int a, int b) {
        if (isTeen(a) || isTeen(b)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }


    //answerCell

    public static boolean answerCell(boolean isMorning, boolean isMom,
                                     boolean isAsleep) {
        if (isAsleep) {
            return false; // If you are asleep, do not answer.
        } else if (isMorning && !isMom) {
            return false; // In the morning, only answer if it is your mom calling.
        } else {
            return true; // In all other cases, normally you answer.
        }
    }

    //teaParty
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; // If either tea or candy is less than 5, the party is bad.
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2; // If either tea or candy is at least double the other one, the party is great.
        } else {
            return 1; // In all other cases, the party is good.
        }
    }


}











