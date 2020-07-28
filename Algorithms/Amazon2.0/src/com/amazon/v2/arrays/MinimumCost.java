package com.amazon.v2.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumCost {

	int[] parents;

	public int minCostToConnect(int n, int[][] edges, int[][] newEdges) {
		parents = new int[n + 1];
		int connected = n, minCost = 0;
		for (int i = 0; i <= n; i++) {
			parents[i] = i;
		}
		for (int[] edge : edges) {
			if (this.union(edge[0], edge[1])) {
				connected--;
			}
		}
		Arrays.sort(newEdges, new Comparator<int[]>() {
			@Override
			public int compare(int[] arr1, int[] arr2) {
				return arr1[2] - arr2[2];
			}
		});
		for (int[] newEdge : newEdges) {
			if (this.union(newEdge[0], newEdge[1])) {
				minCost += newEdge[2];
				connected--;
			}
			if (connected == 1) {
				return minCost;
			}
		}
		return connected == 1 ? connected : -1;
	}

	private boolean union(int x, int y) {
		int setX = find(x);
		int setY = find(y);
		if (setX != setY) {
			parents[setY] = setX;
			return true;
		}
		return false;
	}

	private int find(int num) {
		if (parents[num] != num) {
			parents[num] = find(parents[num]);
		}
		return parents[num];
	}

	public static void main(String[] args) {
		MinimumCost main = new MinimumCost();

		int tc2 = main.minCostToConnect(6, new int[][] { { 1, 2 }, { 2, 3 }, { 4, 5 }, { 3, 5 } },
				new int[][] { { 1, 6, 410 }, { 2, 4, 800 } }); 
		
		int tc3 = main.minCostToConnect(6, new int[][] { { 1, 2 }, { 2, 3 }, { 4, 5 }, { 5, 6 } },
				new int[][] { { 1, 5, 110 }, { 2, 4, 84 },{3,4,79} });
		
        System.out.println(tc2);
		if (tc3 == 410) {
			System.out.println("All Test Case Pases!");
		} else {
			System.out.println("There are test failures!");
		}
	}

}
