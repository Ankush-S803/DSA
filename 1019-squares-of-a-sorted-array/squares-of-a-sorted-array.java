class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; 
        
        int p1 = 0;
        int p2 = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square1 = nums[p1] * nums[p1];
            int square2 = nums[p2] * nums[p2];
           
            if (square1 > square2) {
                result[i] = square1;
                p1++; 
            } else {
                result[i] = square2;
                p2--; 
            }
        }
        
        return result;
    }
}