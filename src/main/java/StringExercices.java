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
        return str.substring(0,size/2);
    }

    public static String nonStart(String a, String b) {

        int sizeA = a.length();
        int sizeB = b.length();

        return a.substring(1, sizeA) + b.substring(1, sizeB);

    }

    public static String theEnd(String str, boolean front) {

        if (front == true){
            return str.substring(0,1);
        }
        else {
            int size = str.length();

            return str.substring(size - 1, size);

        }

    }

    public static boolean endsLy(String str) {

        int size = str.length();
        if(size < 2)
            return false;

        str.substring(size - 2, size);

        if (str.substring(size - 2, size).equals("ly"))
            return true;
        else
            return false;

    }

    public static String middleThree(String str) {
        int size = str.length();
        return str.substring (size/2-1, size/2 +2);

    }

}
