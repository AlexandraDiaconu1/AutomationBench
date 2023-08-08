import java.util.Arrays;

public class ArrayExercise {


    public static void main(String[] args) {


        System.out.println(sameFirstLast(new int[]{1, 2, 3}));     // Output: false
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));  // Output: true
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));     // Output: true


        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));     // Output: true
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));  // Output: false
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));     // Output: true

        System.out.println(sum3(new int[]{1, 2, 3}));    // Output: 6
        System.out.println(sum3(new int[]{5, 11, 2}));   // Output: 18
        System.out.println(sum3(new int[]{7, 0, 0}));


        int[] result1 = reverse3(new int[]{1, 2, 3});
        System.out.println("Reverse3  method  ->>>>>");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println("");


        int[] piArray = makePi();
        System.out.println("MakePi  method  ->>>>>");
        for (int num : piArray) {
            System.out.print(num + " ");
        }
        System.out.println("");


        int[] rotatedArray = rotateLeft3(new int[]{1,2,3});
        System.out.println("Rotate Left  method  ->>>>>");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
        System.out.println("");


        int[] maxEnd3dArray = maxEnd3(new int[]{3,6,23});
        System.out.println("Max End   method  ->>>>>");
        for (int num : maxEnd3dArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        int[] middleWayArray = middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});
        for (int num : middleWayArray) {

        System.out.println("Middle WayA   method  ->>>>>");

        }
        System.out.println("");

        int[] makeEndsArray = makeEnds(new int[]{5, 2, 9});
        for (int num : makeEndsArray) {

            System.out.println("MakeEnds   method  ->>>>>");

        }
        System.out.println("");

        int[] makeLastArray = makeLast(new int[]{4, 5, 6});
        for (int num : makeLastArray) {

            System.out.println("Make Last   method  ->>>>>");

        }
        System.out.println("");

        int[] fix23Array = fix23(new int[]{4, 5, 6});
        for (int num : fix23Array) {

            System.out.println("Fix23   method  ->>>>>");

        }
        System.out.println("");


        int[] biggerTwoArray = biggerTwo(new int[]{4, 5}, new int[]{1, 2});
        for (int num : biggerTwoArray) {

            System.out.println("Bigger Two   method  ->>>>>");

        }
        System.out.println("");

        int[] makeMiddleArray = makeMiddle(new int[]{4, 5});
        for (int num : makeMiddleArray) {

            System.out.println("Make middle   method  ->>>>>");

        }
        System.out.println("");


        int[] plusTwoArray = plusTwo(new int[]{4, 5}, new int[]{3, 4});
        for (int num :plusTwoArray) {

            System.out.println("Plus Two   method  ->>>>>");

        }
        System.out.println("");


        int[] swapEndsArray = swapEnds(new int[]{4, 5,6,7,8});
        for (int num :swapEndsArray) {

            System.out.println("Swap Ends method  ->>>>>");

        }
        System.out.println("");


        int[] midThreeArray = midThree(new int[]{4, 5,6,7,8});
        for (int num :midThreeArray) {

            System.out.println("Mid Three method  ->>>>>");

        }
        System.out.println("");


        int[] frontPieceArray = frontPiece(new int[]{1, 2,3});
        for (int num :frontPieceArray) {

            System.out.println("Front Piece method  ->>>>>");

        }
        System.out.println("");


        //System.out.println(maxEnd3 + "");


        System.out.println(sum2(new int[]{1, 2, 3}));       // Output: 3
        System.out.println(sum2(new int[]{1, 1}));          // Output: 2
        System.out.println(sum2(new int[]{1, 1, 1, 1}));   // Output: 2
        System.out.println(sum2(new int[]{}));

        System.out.println(result1[0] + " " + result1[1]);  // Output: 1 3


        System.out.println(has23(new int[]{2, 5}));  // Output: true
        System.out.println(has23(new int[]{4, 3}));  // Output: true
        System.out.println(has23(new int[]{4, 5}));  // Output: false

        System.out.println(no23(new int[]{4, 5}));  // Output: true
        System.out.println(no23(new int[]{4, 2}));  // Output: false
        System.out.println(no23(new int[]{3, 5}));  // Output: false

        System.out.println(double23(new int[]{2, 2}));  // Output: true
        System.out.println(double23(new int[]{3, 3}));  // Output: true
        System.out.println(double23(new int[]{2, 3}));  // Output: false

        System.out.println(start1(new int[]{1, 2, 3}, new int[]{1, 3}));  // Output: 2
        System.out.println(start1(new int[]{7, 2, 3}, new int[]{1}));     // Output: 1
        System.out.println(start1(new int[]{1, 2}, new int[]{}));         // Output: 1

        // System.out.println(biggerTwo());

        System.out.println(maxTriple(new int[]{1, 2, 3}));  // Output: 3
        System.out.println(maxTriple(new int[]{1, 5, 3}));  // Output: 5
        System.out.println(maxTriple(new int[]{5, 2, 3}));  // Output: 5

        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));      // Output: true
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));   // Output: true
        System.out.println(unlucky1(new int[]{1, 1, 1}));         // Output: false

    }


    //sameFirstLast
    public static boolean sameFirstLast(int[] nums) {
        // Check if the array length is 1 or more
        if (nums.length >= 1) {
            // Compare the first and last elements
            return nums[0] == nums[nums.length - 1];
        } else {
            return false;
        }

    }

    //makePi
    public static int[] makePi() {
        int[] piArray = {3, 1, 4};
        return piArray;
    }


    //commonEnd
    public static boolean commonEnd(int[] a, int[] b) {
        // Check if both arrays have length 1 or more
        if (a.length >= 1 && b.length >= 1) {
            // Compare the first elements and the last elements
            return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
        } else {
            return false;
        }
    }


    //sum3

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;

    }

    //rotateLeft3
    public static int[] rotateLeft3(int[] nums) {
        int[] rotatedArray = {nums[1], nums[2], nums[0]};
        return rotatedArray;
    }


    //reverse3

    public static int[] reverse3(int[] nums) {
        int[] reversedArray = {nums[2], nums[1], nums[0]};
        return reversedArray;
    }

    //maxEnd3
    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]); // Find the maximum of first and last elements
        int[] result = {max, max, max};
        return result;
    }

    // sum2
    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    // middleWay
    public static int[] middleWay(int[] a, int[] b) {
        int[] result = {a[1], b[1]};
        return result;
    }
//makeEnds

    public static int[] makeEnds(int[] nums) {
        int[] result = {nums[0], nums[nums.length - 1]};
        return result;
    }

    //has23
    public static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    //no23
    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }
//makeLast

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    //double23

    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
        }
        return false;
    }

    //fix23
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    //start1
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    //biggerTwo
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumB > sumA || (sumA == sumB && a[0] >= b[0])) {
            return b;
        } else {
            return a;
        }

    }

    //makeMiddle
    public static int[] makeMiddle(int[] nums) {
        int middleIndex = nums.length / 2;
        int[] result = {nums[middleIndex - 1], nums[middleIndex]};
        return result;
    }

    //plusTwo
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = {a[0], a[1], b[0], b[1]};
        return result;
    }


    //swapEnds
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    //midThree
    public static int[] midThree(int[] nums) {
        int middleIndex = nums.length / 2;
        int[] result = {nums[middleIndex - 1], nums[middleIndex], nums[middleIndex + 1]};
        return result;
    }

    //maxTriple
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Math.max(Math.max(first, middle), last);
    }

    //frontPiece
    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return Arrays.copyOf(nums, 2);
        } else {
            return nums;
        }

    }
    //unlucky1

    public static boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        return (nums[0] == 1 && nums[1] == 3) || (nums[len - 2] == 1 && nums[len - 1] == 3);
    }


}





