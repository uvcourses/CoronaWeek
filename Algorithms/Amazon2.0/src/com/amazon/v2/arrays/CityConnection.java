package com.amazon.v2.arrays;

import java.util.Arrays;

public class CityConnection {
	int parents[];

	public int minimumCost(int N, int[][] connections) {
		Arrays.sort(connections, (a, b) -> a[2] - b[2]);
		int[] parents = new int[N + 1];
		Arrays.fill(parents, -1);
		int count = N;
		int sum = 0;

		for (int[] connection : connections) {
			int pA = find(parents, connection[0]);
			int pB = find(parents, connection[1]);

			if (pA == pB) {
				continue;
			}
			parents[pA] = pB;
			sum += connection[2];
			count--;
		}

		return count == 1 ? sum : -1;
	}

	int find(int[] parents, int i) {
		if (parents[i] == -1) {
			return i;
		}
		parents[i] = find(parents, parents[i]);
		return parents[i];
	}

	public int find(int num) {

		if (parents[num] == -1) {
			return num;
		}
		parents[num] = find(parents[num]);
		return parents[num];

	}

	public static void main(String[] args) {
		CityConnection c = new CityConnection();

		System.out.println(c.minimumCost(3, new int[][] { { 1, 2, 5 }, { 1, 3, 6 }, { 2, 3, 1 } }));
	}

}
