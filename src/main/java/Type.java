public class Type {
        public static void main(String[] args) {
            double myDouble = 9.78d;
            int myInt = (int) myDouble; // Explicit casting: double to int

            System.out.println(myDouble);
            System.out.println(myInt);

            int myInt1 = 9;
            double myDouble1 = myInt1; // Automatic casting: int to double

            System.out.println(myInt1);
            System.out.println(myDouble1);
        }
    }

