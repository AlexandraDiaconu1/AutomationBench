public class ExerciseSwitch {
    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        ExerciseSwitch tc = new ExerciseSwitch();
        tc.switchString("B");

        boolean flag = true;
        if (flag) {
            System.out.println("true");
        }
        System.out.println("false");
    }

    }


