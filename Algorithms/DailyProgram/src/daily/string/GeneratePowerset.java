package daily.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePowerset {

	public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {

		List<List<Integer>> powerSet = new ArrayList<>();
		directedPowerSet(inputSet, 0, new ArrayList<Integer>(), powerSet);
System.out.println(powerSet);
		return powerSet;
	}

	private static void directedPowerSet(List<Integer> inputSet, int toBeSelected, List<Integer> selectedSoFar,
			List<List<Integer>> powerSet) {
		if (toBeSelected == inputSet.size()) {
			powerSet.add(new ArrayList<>(selectedSoFar));
			return;
		} 
		System.out.println("Printing");
		selectedSoFar.add(inputSet.get(toBeSelected));
		directedPowerSet(inputSet, toBeSelected + 1, selectedSoFar, powerSet);
		selectedSoFar.remove(selectedSoFar.size() - 1);
		directedPowerSet(inputSet, toBeSelected + 1, selectedSoFar, powerSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratePowerset gen = new GeneratePowerset();
		gen.generatePowerSet(Arrays.asList(0, 1, 2));
	}

}
