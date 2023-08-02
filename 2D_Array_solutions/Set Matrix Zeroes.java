class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dummyrow = new int[row];
        int[] dummycol = new int[col];
        Arrays.fill(dummyrow,-1);
        Arrays.fill(dummycol,-1);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    dummyrow[i]=0;
                    dummycol[j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dummyrow[i]==0 || dummycol[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
