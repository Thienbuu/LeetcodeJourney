class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matR = mat.length;
        int matC = mat[0].length;
        if (matR*matC != r*c) return mat;
        
        int[][] result = new int[r][c];
        int rIdx = 0;
        int cIdx = 0;
        for (int i = 0; i < matR; i++) {
            for (int j = 0; j < matC; j++) {
                result[rIdx][cIdx++] = mat[i][j];
                if (cIdx == c) {
                    cIdx = 0;
                    rIdx++;
                }
            }
        }
        return result;
    }
}
