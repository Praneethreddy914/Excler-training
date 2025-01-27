import java.util.Arrays;

public class LTcode006 {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        
        int j = 1;

        int prev = nums[0]; 
        for (int num : Arrays.copyOfRange(nums, 1, nums.length)) {  // Starting from index 1
            if (num != prev) {
                nums[j] = num;
                j++;
            }
            prev = num; 
        }

        return j;
    }

    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("k = " + k1); 
        System.out.println("Updated nums = " + Arrays.toString(nums1));

        
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("k = " + k2);  
        System.out.println("Updated nums = " + Arrays.toString(nums2));
    }
}
