package daily.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {

		List<List<Integer>> powerSet = new ArrayList<>();

		directedPowerSet(inputSet, 0, new ArrayList<Integer>(), powerSet);
		System.out.println(powerSet);
		return powerSet;

	}

	private static void directedPowerSet(List<Integer> inputSet, int tobeSelected, ArrayList<Integer> selectedSoFar,
			List<List<Integer>> powerSet) {

		if (tobeSelected == inputSet.size()) {
			powerSet.add(new ArrayList<Integer>(selectedSoFar));
			//System.out.println("powerSet : "+selectedSoFar);
			return;
		}
  //generate all subset that contain inputSet [tobeselected]
		
		selectedSoFar.add(inputSet.get(tobeSelected));
	//	System.out.println("Added "+inputSet.get(tobeSelected) + ": to be selected " + tobeSelected + " : "+selectedSoFar);
		directedPowerSet(inputSet, tobeSelected + 1, selectedSoFar, powerSet);
 //Generate allsubset that not contain input[tobeselected] 
		
		selectedSoFar.remove(selectedSoFar.size() - 1);
	//	System.out.println("Removed "+selectedSoFar.remove(selectedSoFar.size() - 1)+ ": to be selected " + tobeSelected+ " : "+selectedSoFar);
		directedPowerSet(inputSet, tobeSelected + 1, selectedSoFar, powerSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerSet p = new PowerSet();
		List<Integer> inputSet = new ArrayList<Integer>();
		inputSet.add(0);
		inputSet.add(1);
		inputSet.add(2);
		inputSet.add(2);

		p.generatePowerSet(inputSet);

	}

}
