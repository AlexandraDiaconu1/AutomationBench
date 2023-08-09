public class CNPValidator {


    private static String control = "279146358279";

//    279146358279
//    1891226226728

    public static void main(String argv[]) {

        checkIfCNPisValid("1891226226728");

    }

    private static void checkIfCNPisValid(String cnp) {
        int[] controlArray = constructArrayFromString("279146358279");
        int[] testCNP = constructArrayFromString(cnp);

//        System.out.println(controlArray.length);
//        System.out.println(testCNP.length);

        int sum = 0;
        for (int i = 0; i < controlArray.length; i++) {
            sum = sum + controlArray[i] * testCNP[i];
        }
        int digitControl = sum % 11;
        if (digitControl == testCNP[12]) {
            System.out.println("is a valid CNP");
        } else {
            System.out.println("cnp is invalid");
        }
    }


    public static int[] constructArrayFromString(String input) {
        int[] digitsArray = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            digitsArray[i] = digit;
        }

        return digitsArray;
    }
}
