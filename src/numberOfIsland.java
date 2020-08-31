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
    public static int solution(char[][] grid){
        if(grid.length == 0 || grid == null){
            return 0;
        }
        int output = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    output++;
                    dfs(grid, i, j);
                }
            }
        }
        return output;
    }

    public static void dfs(char[][] grid, int i, int j){
        if(grid[i][j] == '0' || i < 0 || i >= grid.length || j < 0 || j >= grid[i].length){
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i - 1, j); // down
        dfs(grid, i + 1, j); //up
        dfs(grid, i, j - 1); //left
        dfs(grid, i, j + 1); //right
    }

    public static void main(String[] args){
        char[][] grid = new char[][]{ {'1', '1','0','0','0'}, {'1','1','0','0','0'},{'0','0','1','0','0'}, {'0','0','0','1','1'} };
        int ans = solution(grid);
        System.out.print(ans);
    }
}
