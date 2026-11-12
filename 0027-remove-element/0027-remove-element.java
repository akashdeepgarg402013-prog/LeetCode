class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;

        for (int i=0;i<nums.length-count;i++){
            if (nums[i]==val){
                int temp = nums[i];
                nums[i]=nums[nums.length-1-count];
                nums[nums.length-1-count]=temp;
                count++;
                i--;
            }
        }
        
        return nums.length-count;
    }
}