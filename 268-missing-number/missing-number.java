class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Nsum = 0 ;
        int sum = 0;
        for(int i =0; i< nums.length ; i++){
         sum = sum + nums[i];
        }

        Nsum = n*(n + 1)/2;
        int misSum = Nsum - sum;

        return misSum;

    }
}