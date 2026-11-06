
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit_sum =0;

        for (int i=0;i<nums.length;i++){
            sum+=nums[i];

            int n = nums[i];
            while (n > 0 ){
                digit_sum += n %10;
                n=n/10;
            }
            
        }
        return Math.abs(sum-digit_sum);
    }
}