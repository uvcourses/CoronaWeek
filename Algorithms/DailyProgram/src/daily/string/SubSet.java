package daily.string;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static List<List<Integer>> combination(int n, int k) {
		List<List<Integer>> result = new ArrayList<>();
		directedCombination(n, k, 1, new ArrayList<Integer>(), result);
		return result;
	}

	public static void directedCombination(int n, int k, int offset, List<Integer> partialCombination,
			List<List<Integer>> result) {

		if (partialCombination.size() == k) {
			result.add(new ArrayList<>(partialCombination));
			return;
		}

		int numRemaining = k - partialCombination.size();

		for (int i = offset; i <= n && numRemaining <=n - i + 1; i++) {

			partialCombination.add(i);
			directedCombination(n, k, i + 1, partialCombination, result);
			partialCombination.remove(partialCombination.size() - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSet s = new SubSet();
		s.combination(5, 2);
	}
}
