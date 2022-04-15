/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water
 * and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 */
public class numberOfIsland {
    private char[][] grid;
    private boolean[][] seen;
    private int output = 0;
    public int solution(char[][] grid){
        this.grid = grid;
        this.seen = new boolean[grid.length][grid[0].length];
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    dfs(row, col);
                }
            }
        }
        return output;
    }

    private void dfs(int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return;
        }
        if(seen[row][col] || grid[row][col] == 0) {
            return;
        }
        seen[row][col] = true;
        output += 1;
        dfs(row-1, col);
        dfs(row+1, col);
        dfs(row, col-1);
        dfs(row, col+1);
    }

    public static void main(String[] args){
        char[][] grid = new char[][]{ {'1', '1','0','0','0'}, {'1','1','0','0','0'},{'0','0','1','0','0'}, {'0','0','0','1','1'} };
        numberOfIsland nis = new numberOfIsland();
//        int ans = nis.solution(grid);
        System.out.print(nis.solution(grid));
    }
}




//    public static int solution(char[][] grid){
//        if(grid.length == 0 || grid == null){
//            return 0;
//        }
//        int output = 0;
//
//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[i].length; j++){
//                if(grid[i][j] == '1'){
//                    output++;
//                    dfs(grid, i, j);
//                }
//            }
//        }
//        return output;
//    }
//
//    public static void dfs(char[][] grid, int i, int j){
//        if(grid[i][j] == '0' || i < 0 || i >= grid.length || j < 0 || j >= grid[i].length){
//            return;
//        }
//
//        grid[i][j] = '0';
//        dfs(grid, i - 1, j); // down
//        dfs(grid, i + 1, j); //up
//        dfs(grid, i, j - 1); //left
//        dfs(grid, i, j + 1); //right
//    }