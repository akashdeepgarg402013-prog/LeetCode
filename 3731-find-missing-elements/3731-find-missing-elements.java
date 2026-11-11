class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> a = new ArrayList<>();
        int b = nums[0]; 

        for (int i = 0; i < nums.length ; i++) {
            if (b < nums[i]){
                a.add(b);
                i--;
            }
            b++;
        }
        return a;
    }
}