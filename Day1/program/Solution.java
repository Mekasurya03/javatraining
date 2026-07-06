import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Method to find the two sum indices
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        return new int[] {}; 
    }

    // Main method with sample input to run in VS Code
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Sample Input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Execute the method
        int[] result = solver.twoSum(nums, target);

        // Print the output
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Output Indices: " + Arrays.toString(result));
    }
}