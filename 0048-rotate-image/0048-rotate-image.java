class Solution {
    public void rotate(int[][] matrix) {
        int m= matrix.length;
        int[][] a = new int[m][m];

        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                a[j][m-1-i]=matrix[i][j];               
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = a[i][j];
            }
        }
    }
}