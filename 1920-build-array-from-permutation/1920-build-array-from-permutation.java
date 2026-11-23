class Solution {
    public int[] buildArray(int[] nums) {
        List<Integer> a = new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            a.add(nums[nums[i]]);
        }

        int[] b = new int[nums.length];

        for (int i=0;i<nums.length;i++){
           b[i] = a.get(i);
        }
        return b;
    }
}