class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int block = grid[i][j];
                //skip if block is water
                if (block == 0) continue;
                
                //if corner or edge
                if (i == 0) perimeter++;
                if (i == rows - 1) perimeter++;
                if (j == 0) perimeter++;
                if (j == cols - 1) perimeter++;
                
                //check center block
                if (i != 0 && grid[i-1][j] == 0) perimeter++;      //if top is water
                if (i != rows-1 && grid[i+1][j] == 0) perimeter++; //if bot is water
                if (j != 0 && grid[i][j-1] == 0) perimeter++;      //if left is water
                if (j != cols-1 && grid[i][j+1] == 0) perimeter++; //if right is water
                
                // if (i == 0 || grid[i-1][j] == 0) perimeter++;      //if top is water
                // if (i == rows-1 || grid[i+1][j] == 0) perimeter++; //if bot is water
                // if (j == 0 || grid[i][j-1] == 0) perimeter++;      //if left is water
                // if (j == cols-1 || grid[i][j+1] == 0) perimeter++; //if right is water
            }
        }
        return perimeter;
    }
}
