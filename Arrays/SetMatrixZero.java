//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
    int rows = matrix.length;
       int cols = matrix[0].length;
       
       int zeroCount = 0;
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               if (matrix[i][j] == 0) {
                   zeroCount++;
               }
           }
       }
       
       int[][] zeroes = new int[zeroCount][2];
       int index = 0;
       
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               if (matrix[i][j] == 0) {
                   zeroes[index][0] = i;
                   zeroes[index][1] = j;
                   index++;
               }
           }
       }
       
       for (int[] zero : zeroes) {
           int row = zero[0];
           int col = zero[1];
           
           for (int j = 0; j < cols; j++) {
               matrix[row][j] = 0;
           }
           
           for (int i = 0; i < rows; i++) {
               matrix[i][col] = 0;
           }
       }
   }
   public static void main(String[] args) {
       int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(matrix);
   }
}
