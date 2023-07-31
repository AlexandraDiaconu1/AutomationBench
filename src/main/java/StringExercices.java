public class StringExercices {
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

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

        System.out.println(nTwince("Hello",2 ));
        System.out.println(nTwince("Chocolate",3));
        System.out.println(nTwince("Chocolate",1));


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

    public static String withouEnd2 (String str){

        if (str.length() <= 2) {

            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }

    }
    //nTwince

    public static String nTwince(String str, int n){

        String firstNChars = str.substring(0,n);
        String lastNChars = str.substring(str.length() - n);

        return firstNChars +lastNChars;
    }
}


