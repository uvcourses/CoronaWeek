package com.amazon.v2.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Zombie {

	private static int minDays(int[][] matrix) {
		int days = 0;
		int human = 0;

		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					human++;
				} else {
					queue.add(new int[] { i, j });
				}
			}
		}

		while (!queue.isEmpty() && human > 0) {

			int size = queue.size();

			for (int k = 0; k < size; k++) {

				int current[] = queue.poll();

				int direction[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

				for (int dir = 0; dir < 4; dir++) {
					int newx = current[0] + direction[dir][0];
					int newy = current[1] + direction[dir][1];

					if (newx >= 0 && newy >= 0 && newx < matrix.length && newy < matrix[0].length
							&& matrix[newx][newy] == 0) {
						
						matrix[newx][newy] = 1;
						queue.add(new int[] {newx,newy});
						human--;
					}
				}
			}
			days++;
		}
		return human < 0 ? -1 : days;
	}

	public static void main(String[] args) {
		Zombie z = new Zombie();
		int matrix[][] = { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };
		System.out.println(z.minDays(matrix));
	}

}
