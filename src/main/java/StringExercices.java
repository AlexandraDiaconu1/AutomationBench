public class StringExercices {

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));    // Output: "Hello Bob!"
        System.out.println(helloName("Alice"));  // Output: "Hello Alice!"
        System.out.println(helloName("X"));      // Output: "Hello X!"


        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
        System.out.println(extraEnd("Candy"));
        System.out.println(extraEnd("Code"));


        System.out.println(firstHalf("Woohoo"));

        System.out.println(nonStart("Alex", "Daniel"));
        System.out.println(nonStart("Teddy", "Diana"));


        System.out.println(theEnd("Maria", true));
        System.out.println(theEnd("Maria", false));

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("vari"));

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("Sugar"));

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));


        System.out.println(seeColor("redx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));

        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("Java"));

        System.out.println(left2("Hello"));
        System.out.println(left2("Java"));
        System.out.println(left2("hi"));

        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));

        System.out.println(nTwince("Hello", 2));
        System.out.println(nTwince("Chocolate", 3));
        System.out.println(nTwince("Chocolate", 1));


        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));


        System.out.println(frontAgain("edited"));  // Output: true
        System.out.println(frontAgain("edit"));    // Output: false
        System.out.println(frontAgain("ed"));      // Output: true


        System.out.println(without2("HelloHe"));  // Output: "lloHe"
        System.out.println(without2("HelloHi"));  // Output: "HelloHi"
        System.out.println(without2("Hi"));

        System.out.println(withoutX("xHix"));  // Output: "Hi"
        System.out.println(withoutX("xHi"));   // Output: "Hi"
        System.out.println(withoutX("Hxix"));  // Output: "Hxi"

        System.out.println(firstTwo("Hello"));    // Output: "He"
        System.out.println(firstTwo("abcdefg"));  // Output: "ab"
        System.out.println(firstTwo("ab"));       // Output: "ab"
        System.out.println(firstTwo("X"));        // Output: "X"
        System.out.println(firstTwo(""));


        System.out.println(right2("Hello"));
        System.out.println(right2("java"));   // Output: "vaja"
        System.out.println(right2("Hi"));


        System.out.println(middleTwo("string"));    // Output: "ri"
        System.out.println(middleTwo("code"));      // Output: "od"
        System.out.println(middleTwo("Practice"));  //


        System.out.println(twoChar("java", 0));  // Output: "ja"
        System.out.println(twoChar("java", 2));  // Output: "va"
        System.out.println(twoChar("java", 3));  // Output: "ja"


        System.out.println(atFirst("hello"));  // Output: "he"
        System.out.println(atFirst("hi"));     // Output: "hi"
        System.out.println(atFirst("h"));      // Output: "h@"


        System.out.println(lastTwo("coding"));  // Output: "codign"
        System.out.println(lastTwo("cat"));     // Output: "cta"
        System.out.println(lastTwo("ab"));      // Output: "ba"
        System.out.println(lastTwo("a"));       //


        System.out.println(minCat("Hello", "Hi"));      // Output: "loHi"
        System.out.println(minCat("Hello", "java"));   // Output: "ellojava"
        System.out.println(minCat("java", "Hello"));   // Output: "javaello"
        System.out.println(minCat("abc", "xy"));


        System.out.println(deFront("Hello"));  // Output: "llo"
        System.out.println(deFront("java"));   // Output: "va"
        System.out.println(deFront("away"));   // Output: "aay"
        System.out.println(deFront("abc"));    // Output: "c"
        System.out.println(deFront("x"));      // Output: ""


        System.out.println(withoutX2("xHi"));  // Output: "Hi"
        System.out.println(withoutX2("Hxi"));  // Output: "Hi"
        System.out.println(withoutX2("Hi"));   // Output: "Hi"
        System.out.println(withoutX2("x"));    // Output: ""
        System.out.println(withoutX2(""));     // Output: ""
    }


    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */
    public static String extraEnd(String str) {

        int length = str.length();

        return str.substring(length - 2, length) + str.substring(length - 2, length) + str.substring(length - 2, length);


    }

    public static String firstHalf(String str) {

        int size = str.length();
        return str.substring(0, size / 2);
    }

    public static String nonStart(String a, String b) {

        int sizeA = a.length();
        int sizeB = b.length();

        return a.substring(1, sizeA) + b.substring(1, sizeB);

    }

    public static String theEnd(String str, boolean front) {

        if (front == true) {
            return str.substring(0, 1);
        } else {
            int size = str.length();

            return str.substring(size - 1, size);

        }

    }

    public static boolean endsLy(String str) {

        int size = str.length();
        if (size < 2)
            return false;

        str.substring(size - 2, size);

        if (str.substring(size - 2, size).equals("ly"))
            return true;
        else
            return false;

    }

    public static String middleThree(String str) {
        int size = str.length();
        return str.substring(size / 2 - 1, size / 2 + 2);

    }

    //lastChars

    public static String lastChars(String a, String b) {

        char firstCharA = a.length() > 0 ? a.charAt(0) : '@';
        char lastCharB = b.length() > 0 ? b.charAt(b.length() - 1) : '@';

        return "" + firstCharA + lastCharB;

    }

    //seeColor

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            //startsWith() method to check if the string str starts with "red" or "blue"
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";

        }
    }

    //extraFront

    public static String extraFront(String str) {

        String firstTwoChars;
        if (str.length() >= 2)
            firstTwoChars = str.substring(0, 2);
        else firstTwoChars = str;
        return firstTwoChars + firstTwoChars + firstTwoChars;

    }

    //StartWord

    public static String startWord(String str, String word) {
        if (str.length() >= word.length() &&

                str.substring(1, word.length()).equals(word.substring(1))) {

            return str.substring(0, word.length());
        } else {

            return str.substring(0, 1);
        }
    }

    //withoutEnd
    public static String withoutEnd(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);

        }
    }

    //left2
    public static String left2(String str) {

        if (str.length() <= 3) {
            return str;
        } else {
            return str.substring(2) + str.substring(0, 2);
        }
    }

    //withouEnd2

    public static String withouEnd2(String str) {

        if (str.length() <= 2) {

            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }

    }
    //nTwince

    public static String nTwince(String str, int n) {

        String firstNChars = str.substring(0, n);
        String lastNChars = str.substring(str.length() - n);

        return firstNChars + lastNChars;
    }

    //hasBad
    public static boolean hasBad(String str) {
        // Check if the string starts with "bad"
        boolean startsWithBad = str.startsWith("bad");

        // Check if the string is at least 4 characters long and the substring from index 1 to 3 is "bad"
        boolean hasBadAtIndex1 = str.length() > 3 && str.substring(1, 4).equals("bad");

        // Return true if "bad" appears starting at index 0 or index 1
        return startsWithBad || hasBadAtIndex1;
    }

    public static String makeAbba(String a, String b) {

        return a + b + b + a;
    }

    // conCat
    public static String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {

            return a + b;

        }

        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }
    //frontAgain

    public static boolean frontAgain(String str) {
        int length = str.length();
        if (length < 2) {
            return false;
        }

        String firstTwoChars = str.substring(0, 2);
        String lastTwoChars = str.substring(length - 2);

        return firstTwoChars.equals(lastTwoChars);
    }

    //
    public static String without2(String str) {
        int length = str.length();
        if (length < 2) {
            return str;
        }

        String firstTwoChars = str.substring(0, 2);
        String lastTwoChars = str.substring(length - 2);

        if (firstTwoChars.equals(lastTwoChars)) {
            return str.substring(2);
        } else {
            return str;

        }

    }


    //
    public static String withoutX(String str) {
        int length = str.length();

        // Remove 'x' from the beginning of the string
        if (length > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            length--;
        }

        // Remove 'x' from the end of the string
        if (length > 0 && str.charAt(length - 1) == 'x') {
            str = str.substring(0, length - 1);
        }

        return str;
    }
//  firstTwo

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }


    }

    //right2

    public static String right2(String str) {
        int length = str.length();
        String lastTwoChars = str.substring(length - 2);
        String remainingChars = str.substring(0, length - 2);
        return lastTwoChars + remainingChars;

    }

    //middleTwo
    public static String middleTwo(String str) {
        int length = str.length();
        int middleIndex = length / 2;
        return str.substring(middleIndex - 1, middleIndex + 1);
    }

    //twoChar

    public static String twoChar(String str, int index) {
        int length = str.length();

        // Check if the index is too small or too big
        if (index < 0 || index + 2 > length) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    //atFirst
    public static String atFirst(String str) {
        int length = str.length();
        if (length >= 2) {
            return str.substring(0, 2);
        } else if (length == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    //lastTwo
    public static String lastTwo(String str) {
        int length = str.length();
        if (length < 2) {
            return str;
        } else {
            char lastChar = str.charAt(length - 1);
            char secondLastChar = str.charAt(length - 2);
            return str.substring(0, length - 2) + lastChar + secondLastChar;
        }
    }

    //minCat

    public static String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA > lengthB) {
            a = a.substring(lengthA - lengthB);
        } else if (lengthB > lengthA) {
            b = b.substring(lengthB - lengthA);
        }

        return a + b;
    }
//deFront


    public static String deFront(String str) {
        if (str.length() == 0) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        if (str.charAt(0) == 'a') {
            result.append('a');
        }

        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result.append('b');
        }

        if (str.length() >= 3) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

    //withoutX2
    public static String withoutX2(String str) {
        int length = str.length();

        // Check if the first character is 'x'
        if (length > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            length--;
        }

        // Check if the second character is 'x'
        if (length > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        return str;
    }
}