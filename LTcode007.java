import java.util.Arrays; // Import Arrays for printing arrays

public class LTcode007 {
    // Method to increment the number represented by the digits array
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can add 1 and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next left digit
            digits[i] = 0;
        }
        
        // If all digits are 9, a new array is needed
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // Set the most significant digit to 1
        return result;
    }

    // Main method to test the plusOne function
    public static void main(String[] args) {
        LTcode007 solution = new LTcode007();

        // Test case 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.println(Arrays.toString(result1));  // Output: [1, 2, 4]

        // Test case 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.println(Arrays.toString(result2));  // Output: [4, 3, 2, 2]

        // Test case 3
        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.println(Arrays.toString(result3));  // Output: [1, 0]
    }
}
