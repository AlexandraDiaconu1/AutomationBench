public class Variables {

    public static void main(String[] args) {
        String name = "Alex";
        System.out.println(name);

        String firstName = "Alexandra ";
        String lastName = "Diaconu";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int myNum = 15;
        System.out.println(myNum);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        int myNum3 = 15;
        myNum3 = 20;  // myNum is now 20

        /*final int myNum4 = 15;
        myNum4 = 20;  // will generate an error: cannot assign a value to a final variable*/


        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);



        int myNum6 = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum6);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);


        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);


        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);


        char myGrade = 'B';
        System.out.println(myGrade);

            char myVar1 = 65, myVar2 = 66, myVar3 = 67;
            System.out.println(myVar1);
            System.out.println(myVar2);
            System.out.println(myVar3);

    }
}

