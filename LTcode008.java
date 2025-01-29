class LTcode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        for (; i >= 0 && j >= 0; k--) {
            nums1[k] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        
        for (; j >= 0; k--, j--) {
            nums1[k] = nums2[j];
        }
    }
    
    public static void main(String[] args) {
        LTcode008 solution = new LTcode008();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}