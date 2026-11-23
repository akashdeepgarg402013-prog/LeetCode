// import java.lang.Math;

class Solution {
    public int mirrorDistance(int n) {
        int orig = n;
        int rev=0;
        while (n!=0){
            int temp = n %10;
            rev = rev*10 + temp;
            n=n/10;
        }

        return Math.abs(orig-rev);
    }
}