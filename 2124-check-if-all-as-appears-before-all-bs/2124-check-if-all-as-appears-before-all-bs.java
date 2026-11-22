class Solution {
    public boolean checkString(String s) {
        char[] a = s.toCharArray();
        char[] b = a.clone();
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            return true;
        } else{
            return false;
        }
    }
}