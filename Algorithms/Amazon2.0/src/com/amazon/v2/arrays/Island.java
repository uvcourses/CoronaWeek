package com.amazon.v2.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Island {

	public int numIslands(char[][] grid) {
		int result = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1')
					result += IslandHelper(grid, i, j);
			}
		}

		return result;
	}

	private int IslandHelper(char[][] grid, int row, int col) {
		int result = 0;

		int direction[][] = { { 0, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };

		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] { row, col });

		while (!queue.isEmpty()) {

			int current[] = queue.poll();

			for (int dir[] : direction) {

				int dx = current[0] + dir[0];
				int dy = current[1] + dir[1];

				if (dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[0].length && grid[dx][dy] == '1') {
					queue.add(new int[] { dx, dy });
					grid[dx][dy] = '0';
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		Island is = new Island();
		System.out.println(is.numIslands(new char[][] { {'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'} }));
       
	}

}
