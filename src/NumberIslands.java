/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 * @author 1qa
 *
 */
public class NumberIslands {
	public int numIslands(char[][] grid) {
        if(grid.length == 0)
        	return 0;
        int num = 0;
        for(int i = 0;i < grid.length;i++){
        	for(int j = 0;j < grid[i].length;j++){
        		if(grid[i][j] != '1')
        			continue;
        		dfs(i,j,grid);
        		num++;
        	}
        }
        return num;
    }
	
	public void dfs(int i,int j,char[][] grid){
		if(i >=0 && i < grid.length && j>=0 && j < grid[i].length && grid[i][j] == '1'){
			grid[i][j] = '2';
			dfs(i-1,j,grid);
			dfs(i+1,j,grid);
			dfs(i,j-1,grid);
			dfs(i,j+1,grid);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new NumberIslands().numIslands(new char[][]{{'1','1',0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}));
	}
}
