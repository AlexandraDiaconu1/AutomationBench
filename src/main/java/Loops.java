//public class Loops {
//
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//    }
//    int i = 0;
//    do {
//        System.out.println(i);
//        i++;
//    }
//    while (i < 5);
//
//
//    private int count = 0; // Initialize a counter
//
//    public boolean tester() {
//        if (count < 5) { // Set a condition for the loop to continue
//            count++;     // Increment the counter
//            return true; // Return true to continue the loop
//        } else {
//            return false; // Return false to stop the loop
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        Loops tc = new Loops();
//        while (tc.tester()) {
//            System.out.println("running...");
//        }
//    }
//
//    // Outer loop.
//    for (int i = 1; i <= 2; i++) {
//        System.out.println("Outer: " + i); // Executes 2 times
//
//        // Inner loop
//        for (int j = 1; j <= 3; j++) {
//            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//        }
//    }
//
//
//    //Break and Continue in While LooP
//
//    int i = 0;
//    while (i < 10) {
//        System.out.println(i);
//        i++;
//        if (i == 4) {
//            break;
//        }
//    }
//}
//
