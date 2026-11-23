class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        List<Integer> a = new ArrayList<>();
        
        for (int i=0;i<order.length;i++){
            for (int j=0;j<friends.length;j++){
                if (order[i]==friends[j]){
                    a.add(order[i]);
                }
            }
        }
        int[] b = new int[a.size()];

        for (int k=0;k<a.size();k++){
            b[k] =a.get(k); 
        }
        return b;
    }
}