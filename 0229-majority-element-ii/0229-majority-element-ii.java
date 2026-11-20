class Solution {
    public List<Integer> majorityElement(int[] nums) {
    
    Arrays.sort(nums);
    List<Integer> a = new ArrayList<>();

    int count=1;
    
    for (int i=0;i<nums.length-1;i++){
        if (nums[i]==nums[i+1]){
            count++;
        } else{
            if (count > nums.length/3){
                a.add(nums[i]);
            }
            count=1;
        }
    }
        if (count > nums.length/3){
                a.add(nums[nums.length-1]);
            }
    return a;
    }
}