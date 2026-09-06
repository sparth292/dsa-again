class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int runningSum = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        /*
        BOUNDARY SHRINKING KA METHOD

        top++;
        bottom--;
        left++;
        right--;

        */
        // i guess it will take n*2-1 itretaions to complete the spiral matrix
        
        for(int i = 0 ; i < (n*2-1) ; i++){
            for (int j = left; j <= right; j++) {
                spiralMatrix[top][j] = runningSum;
                runningSum++;
            }
            top++;

            for (int k = top; k <= bottom; k++) {
                spiralMatrix[k][right] = runningSum;
                runningSum++;
            }
            right--;

    
            for (int l = right; l >= left; l--) {
                spiralMatrix[bottom][l] = runningSum;
                runningSum++;
            }
            bottom--;

            for (int m = bottom; m >= top; m--) {
                spiralMatrix[m][left] = runningSum;
                runningSum++;
            }
            left++;
        }
        return spiralMatrix;
    }
}
