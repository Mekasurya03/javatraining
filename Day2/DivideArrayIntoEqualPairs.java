import java.util.Scanner;

public class DivideArrayIntoEqualPairs {

    public static boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = divideArray(nums);

        System.out.println("Can divide into equal pairs: " + result);

        sc.close();
    }
}