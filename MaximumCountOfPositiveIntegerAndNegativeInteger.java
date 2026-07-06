import java.util.Scanner;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public static int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;

        for (int num : nums) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        return Math.max(positive, negative);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maximumCount(nums);

        System.out.println("Maximum Count = " + result);

        sc.close();
    }
}