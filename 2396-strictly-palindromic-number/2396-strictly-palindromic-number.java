class Solution {
    public boolean isStrictlyPalindromic(int n) {

        int count = 0;
        for (int i=2;i<=n-2;i++){
            String a = Integer.toString(n,i);
            String reverse = "";
            for (int j = (a.length() - 1); j >=0; j--) {
                reverse = reverse + a.charAt(j);
            }
            if (!a.equals(reverse)){
                count=1;
            }
        }
        if (count==0){
            return true;
        }
        return false;
    }
}