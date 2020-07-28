package daily.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class IslandProblem {

	public int numIslands(char[][] grid) {

		int row = grid.length;
		int col = grid[0].length;
		int result = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(grid[i][j]=='1')
				result += numIslandHelper(grid, i, j);
			}
		}
		return result;
	}

	private int numIslandHelper(char[][] grid, int row, int col) {

		int dir[][] = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };

		Queue<int[]> queue = new LinkedList();

		queue.add(new int[] { row, col });
		grid[row][col] = '0';
		while (!queue.isEmpty()) {

			int current[] = queue.poll();
			for (int k = 0; k < 4; k++) {
				int dx = current[0] + dir[k][0];
				int dy = current[1] + dir[k][1];
                
				if (isValid(grid, dx, dy)) { 
					grid[dx][dy]='0';
					queue.add(new int[] { dx, dy });
				}
			}
		}
		return 1;
	}

	private boolean isValid(char[][] grid, int dx, int dy) {


		return dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[0].length 
	            && grid[dx][dy] == '1';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IslandProblem is = new IslandProblem();
		System.out.println(is.numIslands(new char[][] { {'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'} }));
	}

}
