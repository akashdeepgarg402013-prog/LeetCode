class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);

        a=a.replace('0' ,'x').replace('1','0').replace('x','1');

        int b = Integer.parseInt(a,2);
        return b;
    }
}