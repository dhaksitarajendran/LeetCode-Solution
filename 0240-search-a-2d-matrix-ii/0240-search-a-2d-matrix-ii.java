class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int row = 0; 
        int col= c-1;
        while(row<r && row>=0 && col>=0 && col<c){
        if(matrix[row][col]==target)
        return true;
        if( target<matrix[row][col])
        col--;
        else
        row++;
        }
      return false;
    }
}