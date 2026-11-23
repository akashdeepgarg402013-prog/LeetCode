class Solution {
    public int[] getConcatenation(int[] nums) {
        
        List<Integer> a = new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }

        int[] b = new int[2*nums.length];
        for (int i=0;i<2*nums.length;i++){
            b[i] = a.get(i);
        }

        return b;
    }
}