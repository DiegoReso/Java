package leetcode;


public class NumIsland {

    private int rows;
    private int cols;

    public int numIsland(char[][] grid){

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        rows = grid.length;
        cols = grid[0].length;

        int numIslands = 0;


        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == '1') {
                    numIslands++;
                    dfs(grid, r, c);
                }
            }
        }
        return numIslands;
    }

    private void dfs(char[][] grid, int r, int c){

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c +1);
        dfs(grid, r, c -1);

    }
}
