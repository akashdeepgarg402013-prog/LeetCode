class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int sum = 0;
            int sum2 = 0;
            for (int j=0;j<i;j++){
                sum+=nums[j];
            }
            leftSum[i]=sum;

            for (int j=nums.length-1;j>i;j--){
                sum2+=nums[j];
            }
            rightSum[i]=sum2;

            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
       
        
        return ans;
    }
}