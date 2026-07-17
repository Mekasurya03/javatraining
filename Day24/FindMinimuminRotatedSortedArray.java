public class FindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {
      
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums = {3, 4, 5, 1, 2};

        int result = findMin(nums);

        System.out.println("Minimum Element = " + result);
    }
}