public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //There are many string methods available, for example toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));


        String programName = "Learn Java in Automation Program for Bench";
        String message = "Welcome to ";

        // concatenate courseName and message to create a new String
        String fullMessage = message + programName;
        System.out.println(fullMessage);

        // use string format
        String fullMessage2 = String.format("%s%s", message, programName);
        System.out.println(fullMessage2);

        // use printf
        System.out.printf("Hello, and %sthe %s.%n", message, programName);

        for (int i = 0; i < 37; i++) {
            char character = programName.charAt(i);
            System.out.println(character);


            //                             1         2         3
            //                   0123456789012345678901234567890123456
            String programName2 = "Learn Java in Automation Program for Bench";
            String message2 = "Welcome to ";

            System.out.println(programName2.charAt(0));
            System.out.println(programName2.charAt(6));

            for (int a = 15; a < 23; a++) {
                System.out.print(programName2.charAt(i));
            }
            System.out.println();

            //IndexOf
            //                             1         2         3
            //                   0123456789012345678901234567890123456
            String courseName = "Learn Java for Beginners Auto Program";

            int position;

            position = indexOfIgnoreCase(courseName, " j");
            System.out.println(position);
        }


        String courseName = "Learn Java for Beginners Auto Program";

        int position = -1;

        do {
            position = indexOfIgnoreCase(courseName, " c", position + 1);
            System.out.println(position);
        } while (position != -1);


        //String Equality
        String first = "This is a String";
        String second = "THIS IS A STRING";

        System.out.println(first == second);
        System.out.println(second == first);
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(second.equalsIgnoreCase(first));


        //Value and Reference Types

        int x = 5;
        int y = 5;
        System.out.printf("x = %d, y = %d %n", x, y);
        System.out.printf("x is the same as y: %s %n", x == y);

        String firstString = "This is a String";
        String secondString = firstString;

        System.out.printf("firstString: %s %n", firstString);
        System.out.printf("secondString: %s %n", secondString);
        System.out.printf("firstString is the same as secondString: %s %n", firstString == secondString);


        int a = 5;
        int b = a;
        System.out.printf("a = %d, b = %d %n", a, b);
        System.out.printf("a is the same as b: %s %n", a == b);

        //Strings are Immutable
        String firstImmutable = "This is a String";
        String secondImutable = firstImmutable;

        System.out.printf("firstImmutable: %s %n", firstImmutable);
        System.out.printf("secondImutable: %s %n", secondImutable);
        System.out.printf("firstImmutable is the same as secondImutable: %s %n", firstImmutable == secondImutable);

        System.out.println();

        firstImmutable = firstImmutable.replace(" ", "_");
        firstImmutable = firstImmutable.replace("_", " ");
        System.out.printf("firstImmutable: %s %n", first);
        System.out.printf("secondImutable: %s %n", secondImutable);
        System.out.printf("firstImmutable is the same as secondImutable: %s %n", firstImmutable == secondImutable);
        System.out.printf("firstImmutable.equals(secondImutable): %s %n", firstImmutable.equals(secondImutable));

        //The StringBuilder Class
        StringBuilder builderOne = new StringBuilder("This is a String");
        StringBuilder builderTwo = builderOne;

        System.out.printf("builderOne: %s %n", builderOne);
        System.out.printf("builderTwo: %s %n", builderTwo);
        System.out.printf("builderOne is the same as builderTwo: %s %n", builderOne == builderTwo);

        System.out.println();

        builderOne = builderOne.replace(4, 5, "_");
//        first = first.replace("_"," ");
        System.out.printf("builderOne: %s %n", builderOne);
        System.out.printf("builderTwo: %s %n", builderTwo);
        System.out.printf("builderOne is the same as builderTwo: %s %n", builderOne == builderTwo);
        System.out.printf("builderOne.equals(builderTwo): %s %n", builderOne.equals(builderTwo));

        //Equality with Reference Types
        StringBuilder primul = new StringBuilder("This is a String");
        StringBuilder doi = new StringBuilder("This is a String");

        String primulString = primul.toString();
        String doiString = doi.toString();

        System.out.printf("primulString: %s %n", primulString);
        System.out.printf("doiString: %s %n", doiString);
        System.out.printf("primulString is the same as doiString: %s %n", primulString == doiString);
        System.out.printf("primulString.equals(doiString): %s %n", primulString.equals(doiString));


        StringBuilder first1 = new StringBuilder("This is a String");

        int v = 12;
        int n = 34;
        int m = 56;

        first1.append(' ');
        first1.append(v);
        first1.append(' ');
        first1.append(3.45);
        first1.append(' ');
        first1.append(a == 12);
        first1.append(' ');
        first1.append(n > m);
        first1.append(' ');
        first1.append("Java is great", 8, 13);

        System.out.println(first);
    }


    private static int indexOfIgnoreCase(String text, String searchText) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase);
    }

    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase, fromIndex);
    }

    //replaceFirst
    private static String replaceByIndex(String original, int start, int length,
                                         String replacement) {
        String toRemove = original.substring(start, start + length);
        return original.replaceFirst(toRemove, replacement);
    }
}

