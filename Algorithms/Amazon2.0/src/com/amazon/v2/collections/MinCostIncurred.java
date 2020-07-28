package com.amazon.v2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinCostIncurred {
	int parent[];

	public int minCost(int numTotalEdgeNodes, int numAvailableNetwork, List<List<Integer>> availableNetwork,
			int numNetworkRoutesConstruct, List<List<Integer>> costNewNetwork) {

		int minCost = 0;

		parent = new int[numTotalEdgeNodes + 1];

		for (int i = 0; i <=numTotalEdgeNodes; i++) {
			parent[i] = i;
		}

		for (List<Integer> avail : availableNetwork) {
			if (this.union(avail.get(0), avail.get(1)))
				numTotalEdgeNodes--;
		}

		Collections.sort(costNewNetwork, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(2) - o2.get(2);
			}
		});

		for (List<Integer> list : costNewNetwork) {
			if (this.union(list.get(0), list.get(1)))
				minCost += list.get(2);
			
			numTotalEdgeNodes--;
			
			if (numTotalEdgeNodes == 1)
				return minCost;
		}

		

		return numTotalEdgeNodes == 1 ? numTotalEdgeNodes : -1;

	}

	private boolean union(int x, int y) {

		int setX = find(x);
		int setY = find(y);

		if (setX != setY) {
			parent[setY] = setX;
			return true;
		}
		return false;
	}

	private int find(int num) {

		if (parent[num] != num) {
			parent[num] = find(parent[num]);
		}
		return parent[num];
	}

	public static void main(String[] args) {

		MinCostIncurred m=new MinCostIncurred(); 
		
		
		List<List<Integer>> availableNetwork =new ArrayList<List<Integer>>();
		List<List<Integer>> costNewNetwork =new ArrayList<List<Integer>>(); 
		
		availableNetwork.add(Arrays.asList(1,2));
		availableNetwork.add(Arrays.asList(2,3));
		availableNetwork.add(Arrays.asList(4,5));
		availableNetwork.add(Arrays.asList(3,5)); 
		
		costNewNetwork.add(Arrays.asList(1,6,410));
		costNewNetwork.add(Arrays.asList(2,4,800)); 
		
	System.out.println(m.minCost(6, 4, availableNetwork, 2, costNewNetwork));
		
	}

}
