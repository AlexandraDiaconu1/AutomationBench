import java.util.Random;
import java.util.Scanner;

public class ExerciseMath {


    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    public static void main(String[] args) {
        System.out.println("Maximul dintre 5 si 10 este " + Math.max(5, 10));
        System.out.println("Minimul dintre 5 si 10 este" + Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        int z = 10;
        System.out.println(z == 10); // returns true, because the value of x is equal to 10

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge); // returns true (25 year olds are allowed to vote!)

        int myAge2 = 25;
        int votingAge2 = 18;

        if (myAge2 >= votingAge2) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

// Given conditions
        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;

        // Evaluate the first sub-expression: (rightTurn && !pedestrian || otherLane)
        boolean firstSubExpression = (rightTurn && !pedestrian) || otherLane;
        System.out.println("First sub-expression: " + firstSubExpression);

        // Evaluate the second sub-expression: (true && !pedestrian && greenLight)
        boolean secondSubExpression = (true && !pedestrian && greenLight);
        System.out.println("Second sub-expression: " + secondSubExpression);

        // Evaluate the entire expression using the correct value for '?'
        boolean result = (firstSubExpression || secondSubExpression);

        System.out.println("Can you go ahead? " + result);

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        }  else {
            System.out.println("Good evening.");
        }



        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;
        int computerValue = randomGenerator.nextInt(3);

        System.out.println("Please enter rock, paper or scissors ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (playerChoice.equals("rock")) {
            playerValue = ROCK;
        }
        if (playerChoice.equals("paper")) {
            playerValue = PAPER;
        }
        if (playerChoice.equals("scissors")) {
            playerValue = SCISSORS;
        }

        System.out.printf("Player chose %s, the value is %s.%n", playerChoice, playerValue);
        scanner.close();


        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2))
            System.out.println("true");
        else
            System.out.println("false");
    }


}


